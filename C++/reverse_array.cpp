// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

// cpp program to reverse given array/string
#include<iostream>
using namespace std;
int main()
{
    int a[10], n, temp;
    cin>>n;

    int j=n-1, i=0;

    for(i=0; i<n; i++)
    {
        cin>>a[i];
    }
    cout<<" ";
    
    for(i=0; i<n/2; i++)
    {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp; 
        j--;
    }
    
    for(i=0; i<n; i++)
    {
        cout<<a[i]<<" ";
    }
}