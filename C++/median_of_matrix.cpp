#include<bits/stdc++.h>
using namespace std;

int main()
{
    int r, c;
    cin>>r>>c;

    int matrix[r][c];
    for (int row = 0; row < r; row++)
    {
        for (int col = 0; col < c; col++)
        {
            cin>>matrix[row][col];
        }   
    }

    int temp[r*c], s=0;

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            temp[s] = matrix[i][j];
            s++;
        }
    }

    sort(temp, temp + s);
    cout<<temp[s/2]<<endl;
}