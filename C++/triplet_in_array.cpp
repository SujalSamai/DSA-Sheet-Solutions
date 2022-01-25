#include <bits/stdc++.h>
using namespace std;

int triplet(int arr[], int n, int x)
{
    sort(arr, arr + n);
    int low, high, sum;
    for (int i = 0; i < n; i++)
    {
        low = i + 1;
        high = n - 1;

        while (low < high)
        {
            sum = arr[low] + arr[i] + arr[high];
            if (sum == x)
            {
                return 1;
            }
            else if (sum > x)
            {
                high--;
            }
            else
            {
                low++;
            }
        }
    }
    return 0;
}

int main()
{
    int n, x;
    cin>>n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    
    cin>>x;

    int temp = triplet(arr, n, x);
    cout<<temp;
}