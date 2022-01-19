#include <bits/stdc++.h>
using namespace std;

int profit(int prices[], int n)
{
    int max_right = prices[n - 1], max_profit = 0;
    for (int i = n - 1; i > 0; i--)
    {
        max_right = max(max_right, prices[i]);
        max_profit = max(max_profit, max_right - prices[i]);
    }
    return max_profit;
}
int main()
{
    int prices[1000], n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> prices[i];
    }
    int max_profit = profit(prices, n);
    cout << max_profit << endl;
}