// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1

#include <bits/stdc++.h>
using namespace std;

int minimize_height(int arr[], int n, int k)
{
    sort(arr, arr + n);
    int max_num, min_num;
    int min_diff = arr[n - 1] - arr[0];

    for (int i = 1; i < n; i++)
    {
        if (arr[i] >= k)
        {
            max_num = max(arr[i - 1] + k, arr[n - 1] - k);
            min_num = min(arr[0] + k, arr[i] - k);
            min_diff = min(min_diff, max_num - min_num);
        }
    }
    return min_diff;
}
int main()
{
    int n, k, arr[100];
    cin >> k >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int min_diff = minimize_height(arr, n, k);
    cout << min_diff << endl;
}