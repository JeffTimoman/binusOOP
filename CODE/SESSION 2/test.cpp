#include <stdio.h>

void f(){
    f();
}

int main(){
    f();
    return 0;
}
