#include <bits/stdc++.h>
using namespace std;

int main()
{ 
    int n, m, k;
    cin>>n>>m;
    
    int matrix[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin>>matrix[i][j];
        }
    }

    cin >> k;
    int temp[n*m], size=0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++, size++)
        {
            temp[size] = matrix[i][j];
        }       
    }
    sort(temp, temp + size);
    
    cout<<temp[k-1]<<endl;
    
}