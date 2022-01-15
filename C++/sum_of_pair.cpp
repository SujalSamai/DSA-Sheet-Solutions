#include<bits/stdc++.h>
using namespace std;
int pair_of_sum(int arr[], int n, int k){
    int sum = 0, count=0;
    
    for (int i = 0; i < n; i++){
        for (int j = i; j < n; j++){
            if(i<j){
                sum = arr[i] + arr[j];
                if(sum == k){
                    count ++;
                }   
            }
        }
    }
    return count;
}
int main()
{
    int arr[100], n, k;
    cin>>n>>k;
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    int sum_pair = pair_of_sum(arr, n, k);
    cout<<sum_pair<<endl;
}