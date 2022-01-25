#include <bits/stdc++.h>
using namespace std;

int median_of_arrays(int arr1[], int arr2[], int n, int m)
{
    int arr3[m + n], k = 0;
    int median;
    for (int i = 0; i < n; i++)
    {
        arr3[k] = arr1[i];
        k++;
    }
    for (int j = 0; j < m; j++)
    {
        arr3[k] = arr2[j];
        k++;
    }
    sort(arr3, arr3 + k);

    if (k % 2 == 0)
    {
        median = (arr3[k / 2] + arr3[(k / 2) - 1]) / 2;
    }
    else
    {
        median = arr3[k / 2];
    }
    return median;
}

int main()
{
    int n, m;
    cin >> n >> m;
    int arr1[n], arr2[m];

    for (int i = 0; i < n; i++)
    {
        cin >> arr1[i];
    }
    for (int i = 0; i < m; i++)
    {
        cin >> arr2[i];
    }
    int median = median_of_arrays(arr1, arr2, n, m);
    cout << median << endl;
}
