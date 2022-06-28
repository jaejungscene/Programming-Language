#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct result{
    double averge;
    double variance;
}RESULT;

double arithmetical_average(double* value, int n);
double weighted_average(double* value, double* weight, int n); //expectation
double variance(double* value, double* weight, double average, int n);

int main(){
    char str[100]; //storage1 of values
    char str1[100]; //storage2 of values
    int count=0; //size of values
    RESULT statistics = {0,0};


    printf("\n\n<< Separate the Values By Space >>\n");
    scanf("%[^\n]", str);
    strcpy(str1, str);
    char *token = strtok(str," ");
    while(token!=NULL){
        count++;
        token = strtok(NULL, " ");
    }


    double* value = (double*)malloc(sizeof(double)*count);
    double* weight = (double*)malloc(sizeof(double)*count);

    token = strtok(str1," ");
    for(int i=0; i<count; i++){//str으로 받은 values를 double 형으로 변환후 배열에 저장
        value[i] = atof(token);
        token = strtok(NULL, " ");
    }


    int answer;
    printf("\nEnter (1)Normal , (2)Weighted  Statistics >>  ");
    scanf("%d", &answer);
    if(answer==1){
        for(int i=0; i<count; i++){
            weight[i] = 1;
        }
    
        statistics.averge = arithmetical_average(value, count);
        statistics.variance = variance(value,weight,statistics.averge,count ); 
        printf("\nartihmetical average = %.4lf\n", statistics.averge );
        printf("normal variance = %.4lf\n", statistics.variance );
        printf("sample variance = %.4lf\n\n\n", ((statistics.variance)*count)/(count-1) );
    }
    else if(answer==2){
        printf("\n<< Enter the weights for each value IN ORDER!! >>\n");
        for(int i=0; i<count; i++){
            scanf("%lf", &weight[i]);
        }

        statistics.averge = weighted_average(value, weight, count);
        statistics.variance = variance(value,weight,statistics.averge,count);
        printf("\nweighted average = %.4lf\n", statistics.averge);
        printf("weighted variance = %.4lf\n\n\n", statistics.variance);
    }


    free(value);
    free(weight);

    return 0;     
}


double  arithmetical_average(double* value, int n){
    double ave=0;
    for(int i=0; i<n; i++){
        ave += value[i];
    }
    ave /= n;
    return ave;
}


double weighted_average(double* value, double* weight, int n){
    double ave=0;
    double sumWeight = 0;
    for(int i=0; i<n; i++){
        ave += (value[i]*weight[i]);
    }
    for(int i=0; i<n; i++){
        sumWeight += weight[i];
    }
    ave /= sumWeight;
    return ave;
}


double variance(double* value, double* weight, double average, int n){
    double variance=0;
    double expec_2=0;
    double sumWeight=0;
    for(int i=0; i<n; i++){
        expec_2 += (value[i]*value[i]*weight[i]);
    }
    for(int i=0; i<n; i++){
        sumWeight += weight[i];
    }
    expec_2 /= sumWeight;
    variance = expec_2 - (average*average);
    return variance;
}