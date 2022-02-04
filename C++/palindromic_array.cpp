#include <bits/stdc++.h>
using namespace std;

int palindromic_array(int arr[], int n)
{
    int flag = 0;
    for (int i = 0; i < n; i++)
    {
        int rev = 0, rem, temp;
        temp = arr[i];
        while (arr[i] > 0)
        {
            rem = arr[i] % 10;
            rev = rev * 10 + rem;
            arr[i] = arr[i] / 10;
        }
        if (rev != temp)
        {
            flag = 1;
            break;
        }
    }
    if (flag == 0)
    {
        return 1;
    }
    else
    {
        return 0;
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
    int answer = palindromic_array(arr, n);
    cout << answer << endl;
}