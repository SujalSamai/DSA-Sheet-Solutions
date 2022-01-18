// https://leetcode.com/problems/find-the-duplicate-number/

#include <bits/stdc++.h>
using namespace std;
int duplicate_element(int arr[], int n)
{
    sort(arr, arr + n);

    for (int i = 0; i < n; i++)
    {
        if (arr[i + 1] == arr[i])
        {
            return arr[i];
        }
    }
    return -1;
}
int main()
{
    int n;
    int arr[1000];
    cin >> n;
    for (int i = 0; i <= n; i++)
    {
        cin >> arr[i];
    }
    int repeated_num = duplicate_element(arr, n);
    cout << repeated_num;

    return 0;
}