#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct Node{
    char c;
    struct Node *left;
    struct Node *right;
};

struct Node* createNode(char c){
    struct Node* temp=(struct Node*)malloc(sizeof(struct Node));
    temp->c=c;
    temp->left= temp->right=NULL;
    return temp;
}

int isOperator(char c){
    char op[] = "%*-^+/";
    if(strchr(op,c)!=NULL){
        return 1;
    }
    return 0;
}

int p = 0;
char s[100];

void insert(struct Node*curr){
    if(isOperator(s[p])){
        curr->left=createNode(s[p]);
        p++;
        insert(curr->left);
        curr->right=createNode(s[p]);
        p++;
        insert(curr->right);
    }
}

void prefix(struct Node*curr){
   printf("%c",curr->c);
    if(curr->left!=NULL){
        prefix(curr->left);
    }
    if(curr->right!=NULL){
        prefix(curr->right);
    }
}

void infix(struct Node*curr){
    if(curr->left!=NULL){
        infix(curr->left);
    }
    printf("%c",curr->c);
    if(curr->right!=NULL){
        infix(curr->right);
    }
}

void postfix(struct Node*curr){
    if(curr->left!=NULL){
        postfix(curr->left);
    }
    if(curr->right!=NULL){
        postfix(curr->right);
    }
    printf("%c",curr->c);
}

int main(){
    char s[100];
    scanf("%s", s); 
    int len = strlen(s);
    int p = 0; 

    struct Node *root=createNode(s[p++]);
    insert(root);
    printf("Prefix expression: ");
    prefix(root);
    printf("\n");
    printf("Infix expression: ");
    infix(root);
    printf("\n");
    printf("Postfix expression: ");
    postfix(root);
    printf("\n");
    return 0;
}
