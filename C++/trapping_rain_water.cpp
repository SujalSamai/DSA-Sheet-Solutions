#include <bits/stdc++.h>
using namespace std;

//https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1

long long trapping_water(int arr[], int n)
{
    long long water_trapped = 0;
    int left = 0, right = n - 1;
    int left_max = arr[0], right_max = arr[n - 1];

    while (left <= right)
    {
        if (arr[left] < arr[right])
        {
            left_max = max(left_max, arr[left]);
            water_trapped += left_max - arr[left];
            left++;
        }
        else
        {
            right_max = max(right_max, arr[right]);
            water_trapped += right_max - arr[right];
            right--;
        }
    }
    return water_trapped;
}

int main()
{
    int n, total = 0;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout << trapping_water(arr, n) << endl;
}