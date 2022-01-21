#include <bits/stdc++.h>
using namespace std;

int n_by_k_times(int arr[], int n, int k)
{
    map<int, int> m;
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        m[arr[i]]++;
        if (m[arr[i]] > n / k)
        {
            count++;
            m[arr[i]] = -1000;
        }
    }
    return count;
}
int main()
{
    int n, arr[1000], k;
    cin >> n >> k;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int total_count = n_by_k_times(arr, n, k);
    cout << total_count << endl;
}