#include <bits/stdc++.h>
using namespace std;

void merge(int arr1[], int arr2[], int n, int m)
{
    int i = n-1, j = 0;
    while (i >= 0 && j < m)
    {
        if (arr1[i] >= arr2[j])
        {
            swap(arr1[i], arr2[j]);
            i--; 
            j++;
        }
        else
        {
            break;
        }
    }
    sort(arr1, arr1 + n);
    sort(arr2, arr2 + m);
}
int main()
{
    int n, m, arr1[1000], arr2[1000];
    cin >> n >> m;
    for (int i = 0; i < n; i++)
    {
        cin >> arr1[i];
    }
    for (int j = 0; j < m; j++)
    {
        cin >> arr2[j];
    }

    merge(arr1, arr2, n, m);
    for (int i = 0; i < n; i++)
    {
        cout << arr1[i] << " ";
    }
    for (int i = 0; i < m; i++)
    {
        cout << arr2[i] << " ";
    }
    cout<<endl;
}