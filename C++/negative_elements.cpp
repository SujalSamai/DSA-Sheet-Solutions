#include<bits/stdc++.h>
using namespace std;

void sort_negative(int a[], int size)
{
    int j=0;
    for(int i=0; i<size; i++)
    {
        if(a[i]<0)
        {
            swap(a[j],a[i]);  
            j++;
        }
    }

    for(int i=0; i<size; i++)
    {
        cout<<a[i]<<" ";
    }
}

int main()
{
    int n, i, arr[100];
    cin>>n;
    for(i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    sort_negative(arr, n);
}