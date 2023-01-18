#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct Node{
	char name[100];
	int age;
	Node *next;
	Node *prev;
};

Node *createNode(const char *name, const int age){
	Node *node = (Node*)malloc(sizeof(Node));
	strcpy(node->name, name);
	node->age = age;
	node->next = node->prev = NULL;
	return node;
}

void pushHead(Node **HEAD, Node **TAIL, Node *node){
	if(!*HEAD){
		*HEAD = *TAIL = node;
	}else{
		node->next = *HEAD;
		(*HEAD)->prev = node;
		*HEAD = node;
	}
}

void pushTail(Node **HEAD, Node **TAIL, Node *node){ 
	if(*HEAD == NULL){
		*HEAD = *TAIL = node;
	}else{
		node->prev = *TAIL;
		(*TAIL)->next = node;
		*TAIL = node;
	}
}

void view(Node *HEAD){
	Node *curr = HEAD;
	while(curr){
		printf("%s - %d\n", curr->name, curr->age);
		curr = curr->next;
	}
}
int main(){
	Node *HEAD = NULL;
	Node *TAIL = NULL;
	pushHead(&HEAD, &TAIL, createNode("Budi", 20));
    pushHead(&HEAD, &TAIL, createNode("Andi", 21));
    pushTail(&HEAD, &TAIL, createNode("Caca", 22));
    
    view(HEAD);
	return 0;
}