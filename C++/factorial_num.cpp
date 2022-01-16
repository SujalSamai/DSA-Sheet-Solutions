#include<bits/stdc++.h>
using namespace std;

int factorial(int n){
    if(n==0 || n==1){
        return 1;
    }
    else{
        int factorial_num = n * factorial(n-1);
        return factorial_num;
    }
}
int main(){
    int n;
    cin >> n;
    int factorial_of_n = factorial(n);
    cout << factorial_of_n << endl;

    // using loop
    // int fact=1;
    // for (int i = 1; i <= n; i++)
    // {
    //     fact = fact * i;
    // }
    // cout << fact << endl;
    
    return 0;
}