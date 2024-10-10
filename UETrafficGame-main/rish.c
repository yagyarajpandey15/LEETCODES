#include <stdio.h>

int main() {
    int num = 55;

    // Loop to print the multiplication table
    for (int i = 1; i <= 10; i++) {
        printf("%d x %d = %d\n", num, i, num * i);
    }

    return 0;
}
