#include <bits/stdc++.h>
using namespace std;

bool subset_arr(int arr1[], int arr2[], int n, int m)
{
    int i, j;
    for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++) {
            if (arr2[i] == arr1[j])
            {
                break;
            }
        }
        if (j == m)
        {
            return 0;
        }          
    }
    return 1;
}

int main()
{
    int n, m;
    cin>>n>>m;
    int arr1[n], arr2[m];

    for (int i = 0; i < n; i++)
    {
        cin>>arr1[i];
    }
    for (int i = 0; i < m; i++)
    {
        cin>>arr2[i];
    }
    
    if (subset_arr(arr1, arr2, m, n))
    {
        cout<<"Yes"<<endl;
    }
    else
    {
        cout<<"No"<<endl;
    }

    return 0;
}