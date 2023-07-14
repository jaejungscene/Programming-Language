#include <stdio.h>

int main(){
    int a;
    int b;
    int x = 0;
    int y = 0;
    for(a=6; a<20; a++){
        b=a/2;
        for(int i=1; i<=b; i++){
            if(a%i==0){
                x+=i;
            }
        }
        printf("a = %d, b = %d, x = %d\n", a, b, x);
        if(x==a){
            printf("%d\n", a);
            y++;
        }
    }
    printf("%d\n", y);
    return 0;
}