#include<iostream>
using namespace std;

int inversion_count(int arr[], int n)
{
    int count=0;
    for(int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if(i<j && arr[i]>arr[j])
            {
                count++;
            }
        }
    }
    return count;
}

int main()
{
    int n, arr[100];
    cin>>n;
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    int count_invers = inversion_count(arr, n);
    cout<<count_invers<<endl;
    
}