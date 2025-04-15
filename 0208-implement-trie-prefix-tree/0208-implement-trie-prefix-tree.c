typedef struct Trie {
    int isLeaf;
    struct Trie* child[26];
} Trie;
Trie* trieCreate() {
    Trie* temp = (Trie*)malloc(sizeof(Trie));
    temp->isLeaf = 0;
    for (int i = 0; i < 26; i++) {
        temp->child[i] = NULL;
    }
    return temp;
}
void trieInsert(Trie* obj, char* word) {
    Trie* p = obj;
    while (*word) {
        if (p->child[*word - 'a'] == NULL) {
            p->child[*word - 'a'] = trieCreate();
        }
        p = p->child[*word - 'a'];
        word++;
    }
    p->isLeaf = 1;
}
bool trieSearch(Trie* obj, char* word) {
    Trie* p = obj;
    while (*word) {
        if (p->child[*word - 'a'] == NULL) {
            return false;
        }
        p = p->child[*word - 'a'];
        word++;
    }
    return p->isLeaf; 
}

bool trieStartsWith(Trie* obj, char* prefix) {
    Trie* p = obj;
    while (*prefix) {
        if (p->child[*prefix - 'a'] == NULL) {
            return false;
        }
        p = p->child[*prefix - 'a'];
        prefix++; 
    }
    return true;
}

void trieFree(Trie* obj) {
    if (obj == NULL) return;
    for (int i = 0; i < 26; i++) {
        if (obj->child[i] != NULL) {
            trieFree(obj->child[i]);
        }
    }
    free(obj);
}
