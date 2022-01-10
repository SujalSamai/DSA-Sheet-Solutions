// https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

#include<iostream>
using namespace std;
int main()
{
    int i, n, max, min;
    int arr[10];    
    
    cin>>n;

    for(i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    
    max = arr[0];
    min = arr[0];
    for(i=0; i<n; i++)
    {
        if(max < arr[i])
        {
            max=arr[i];
        }
        if(min > arr[i])
        {
            min=arr[i];
        }
    }
    cout<<"Maximum elements = "<<max<<" & minimum element = "<<min<<endl;

    return 0;
}