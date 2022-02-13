#include <bits/stdc++.h>
using namespace std;

void rearrange(int arr[], int n)
{
    int i = 0, j = n - 1;

    //arranging positive elements one side and negative another side
    while (i < j)
    {
        while (i <= n - 1 && arr[i] > 0)
        {
            i += 1;
        }
        while (j >= 0 && arr[j] < 0)
        {
            j -= 1;
        }
        if (i < j)
        {
            swap(arr[i], arr[j]);
        }
    }

    if (i == 0 || i == n)
        return;

    int k = 0;
    while (k < n && i < n)
    {
        swap(arr[k], arr[i]);
        i = i + 1;
        k = k + 2;
    }
}
int main()
{
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    rearrange(arr, n);

    cout << "Rearranged array is \n";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    
    return 0;
}