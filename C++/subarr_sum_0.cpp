#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }

    unordered_map<int, int> m;
    
    int sum = 0, flag = 0;
    for (int i = 0; i < n; i++)
    {
        sum += arr[i];
        if(sum == 0 || m[sum] || arr[i] == 0)
        {
            flag = 1;
            break;
        }
        else
        {
            m[sum] = 1;
        }
    }
    if(flag == 1)
    {
        printf("Yes\n");
    }
    else
    {
        printf("No\n");
    }
}