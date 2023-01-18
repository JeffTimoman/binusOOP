#include <stdio.h>

struct kpi{
    char name[20];
    int value;
};

void readData(int arr[]){

}

void readKpi(kpi k[]){
}


int main(){

    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    kpi k[10];
    k[0].name = "kpi1";
    k[0].value = 1;
    k[1].name = "kpi2";
    k[1].value = 2;
    return 0;
}