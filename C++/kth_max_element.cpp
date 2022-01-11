// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

#include<bits/stdc++.h>
#include<algorithm>
using namespace std;
int main()
{
    int arr[100], n, k, i;
    cin>>n;
    for(i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    sort(arr, arr + n);

    cout<<"Sorted array is: ";
    for(i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }
    cin.get();
    cin>>k;
    cout<<k<<"th minimum element is "<<arr[k-1]<<endl;
    cout<<k<<"th maximum element is "<<arr[n-k]<<endl; 
}