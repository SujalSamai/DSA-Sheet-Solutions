#include<bits/stdc++.h>
using namespace std;

void union_array(int a[], int b[], int n, int m)
{
    int union_arr[100];
    int i, j, k=0;

    for(i=0; i<n; i++)
    {
        union_arr[k]=a[i]; 
        k++; 
    }
    for(i=0; i<m; i++)
    {
        int flag=0;
        for(j=0; j<n; j++)
        {
            if(b[i]==a[j])
            {
                flag=1;
            }
        }
        if(flag!=1)
        {
            union_arr[k]=b[i];
            k++;
        }
    }
    cout<<"Union: ";
    for(i=0; i<k; i++)
    {
        cout<<union_arr[i]<<" ";
    }
}

void intersection(int a[], int b[], int n, int m)
{
    int inter_arr[100];
    int i, j, k=0;
    for(i=0; i<n; i++)
    {
        for(j=0; j<m; j++)
        {
            if(a[i]==b[j])
            {
                inter_arr[k]=a[i];
                k++;
            }
        }
    }
    cout<<"\nIntersection: ";
    for(i=0; i<k; i++)
    {
        cout<<inter_arr[i]<<" ";
    }
}
int main()
{
    int n, m, i;
    int array1[100], array2[100];
    cout<<"Enter size for array1 & array2: "<<endl;
    cin>>n>>m;
    cout<<"Enter elements for array1: "<<endl; 
    for(i=0; i<n; i++)
    {
        cin>>array1[i];
    }
    cout<<"Enter elements for array2: "<<endl;
    for(i=0; i<m; i++)
    {
        cin>>array2[i];
    }
    union_array(array1, array2, n, m);
    intersection(array1, array2, n, m);
}