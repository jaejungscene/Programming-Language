// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    int i, sum=0;
    for(i=1; i<=10; i+=2){
        if(i%2 && i%3) continue;
        sum += i;
    }
    printf("%d\n", sum);
    return 0;
}