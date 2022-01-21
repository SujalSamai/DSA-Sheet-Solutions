#include <bits/stdc++.h>
using namespace std;

int num_of_jumps(int arr[], int n)
{
    int jump = arr[0];
    if (n <= 1)
    {
        return 0;
    }
    if (arr[0] == 0)
    {
        return -1;
    }
    else
    {
        for (int i = 0; i < n; i++)
        {
            if (i > n)
            {
                return arr[n - 1];
            }
            i = i + arr[i];
            jump++;
        }
        return jump - 1;
    }
}

int main()
{
    int n;
    cin >> n;
    int arr[1000];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int jump = num_of_jumps(arr, n);
    cout << jump << endl;
}