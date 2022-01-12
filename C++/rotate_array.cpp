#include<bits/stdc++.h>
using namespace std;
void rotate_array(int array[], int size)
{   
    int last=array[size-1];
    for(int i=size-1; i>0; i--)
    {
        array[i]=array[i-1];
    }
    array[0]=last;
    
    for(int i=0; i<size; i++)
    {
        cout<<array[i]<<" ";
    }   
}
int main()
{
    int arr[100], n;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    rotate_array(arr, n);
}