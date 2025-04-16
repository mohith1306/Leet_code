#include<stdbool.h>
bool vowel(char c){
    return (c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U' );
}
char* reverseVowels(char* s) {
    int i=0;
    int j=strlen(s) -1 ;
    while(i<j){
        if(vowel(s[i]) && vowel(s[j])){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--; 
        }
        else if(!vowel(s[i])){
            i++;
        }
        else{
            j--;
        }
    }
    return s;
}