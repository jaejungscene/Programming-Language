#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct Node{
    int data;
    struct Node *next;
    struct Node *prev;
}Node;

enum bool {False, True};

int main(){
    time_t time;
    struct Node node = {1};
    printf("%d %d\n", node.data, node.next);
    printf("%ld\n", (long)time);
    printf("%s", asctime(gmtime(&time)));
    return 0;
}