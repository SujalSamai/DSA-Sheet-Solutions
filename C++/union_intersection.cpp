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
        for(j=0; i<m; j++)
        {
            if(a[i]==b[j])
            {
                inter_arr[k]=a[i];
                k++;
            }
        }
    }
    cout<<"Intersection: ";
    for(i=0; i<k; i++)
    {
        cout<<inter_arr[i]<<" ";
    }
}
int main()
{
    int n, m, i;
    int a[100], b[100];
    cin>>n>>m;
    cout<<"For array1: "<<endl; 
    for(i=0; i<n; i++)
    {
        cin>>a[i];
    }
    cout<<"For array2: "<<endl;
    for(i=0; i<m; i++)
    {
        cin>>b[i];
    }
    union_array(a, b, n, m);
    intersection(a, b, n, m);
}