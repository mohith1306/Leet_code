bool isPalindrome(char* s) {
    int len = strlen(s);
    char new_str[len+1];
    int new_len=0;
    for(int i=0;s[i]!='\0';i++){
        if(isalpha(s[i])){
            new_str[new_len++] = tolower(s[i]);
        }
        else if(isdigit(s[i])){
            new_str[new_len++] = (s[i]);
        }
    }
    new_str[new_len] = '\0';
    for(int i=0 , j=new_len-1; i<j ; i++,j--){
        if(new_str[i] != new_str[j]){
            return false;
        }
    }
    return true;
    
}