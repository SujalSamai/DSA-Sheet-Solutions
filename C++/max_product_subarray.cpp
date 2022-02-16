#include<bits/stdc++.h>
using namespace std;

//in place of array, vector can also be used
int max_product(int arr[], int n)
{
    int ma, mi, ans;
    ans = arr[0];
    ma = arr[0];
    mi = arr[0];
    for (int i = 1; i < n; i++)
    {
        if(arr[i]<0)
        {
            swap(ma, mi);
        }
        ma = max(arr[i], ma*arr[i]);
        mi = min(arr[i], mi*arr[i]);
        ans = max(ans, ma);
    }
    return ans;
}
int main()
{
    int n;
    cin>>n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    
    int ans = max_product(arr, n);
    cout<<ans<<endl;
}
