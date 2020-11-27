#include "ctype.h"
#include "stdio.h"
#include "stdlib.h"
#include "string.h"

int main(int argc, char* argv[]) {
    printf("Hello,");

    if(argc > 1)
        for(int i = 1; i < argc; ++i) {
            size_t n = strlen(argv[i]);
            char* str = malloc(n + 1);

            strncpy(str, argv[i], n);
            str[0] = toupper(str[0]);
            str[n] = '\0';

            printf(" %s", str);

            free(str);
        }
    else
        printf(" World");

    printf("!\n");

    return 0;
}
