#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    int matrix[n][m], temp[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> matrix[i][j];
        }
    }
    
    for (int i = 0; i < n; i++)
    {
        for (int j = n-1; j >= 0; j--)
        {
            cout<<matrix[j][i]<<" ";
        }
        cout<<endl;
    }
    
}