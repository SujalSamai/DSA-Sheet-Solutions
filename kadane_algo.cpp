#include<bits/stdc++.h>
using namespace std;

int kadane_algo(int arr[], int n){
        int max_sum = arr[0], sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
            if(max_sum < sum){
                max_sum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max_sum;
    }
int main()
{
    int arr[100], n, sum=0, i;
    cin>>n;

    for(i = 0; i < n; i++){
        cin >> arr[i];
    }
    int max_sum_final = kadane_algo(arr, n);
    cout << max_sum_final << endl;
    
}