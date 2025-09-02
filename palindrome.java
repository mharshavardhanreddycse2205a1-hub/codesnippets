#include <stdio.h>
#include <string.h>

int is_palindrome(const char *s) {
    size_t i = 0, j = strlen(s);

    // strip trailing newline if present
    if (j > 0 && s[j - 1] == '\n') j--;
    if (j == 0) return 1; // empty string treated as palindrome
    j--; // last character index

    while (i < j) {
        if (s[i] != s[j]) return 0;
        i++;
        j--;
    }
    return 1;
}

int main(void) {
    char s[1024];
    printf("Enter a string: ");
    if (!fgets(s, sizeof s, stdin)) return 1;

    if (is_palindrome(s))
        printf("Palindrome\n");
    else
        printf("Not a palindrome\n");

    return 0;
}
