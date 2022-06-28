#include <stdio.h>
#include <math.h>
#include <stdarg.h>

#define av(x, y) ((x+=y)-y)
#define av1(x, y) (x##y)

double sample_variance(int n,...);

typedef struct node{
    int x;
    double d;
}NODE;
int main(){
    double x;
    int y;
    char string[10] = {"teststing"};
    NODE nod = {1,2.1};
    printf("%s", string);
    return 0;
}

double sample_variance(int n,...){
    va_list list = NULL;
    double para, ave=0, var=0;
    int flag=0;


    printf("Sample Size : %d\n", n);
    va_start(list, n);
    for(int i=0; i<n; i++){//to get sample_average
        para = va_arg(list, double);

        ave += para;
        if(flag%7==0 && i!=0) printf("\n"); //grouping consecutive 7-value
        flag++;
        printf("Value%-2d: %.2f\t", i+1, para); //%- = Left_Sort
    }
    ave /= n;

    printf("\n\n");
    va_start(list, n);
    for(int i=0; i<n; i++){
        para = va_arg(list, double);
        var += pow(para-ave, 2);
    }
    var /= (n-1);

    return var;
}