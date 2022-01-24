#include <bits/stdc++.h>
using namespace std;

int median_of_arr(int arr[], int n)
{
    sort(arr, arr + n);
    int median;
    if (n % 2 == 0) 
    {
        median = (arr[n / 2] + arr[(n / 2) - 1]) / 2; 
    }
    else
    {
        median = arr[n / 2];
    }
    return median;
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    int median = median_of_arr(arr, n);
    cout<<median<<endl;
}