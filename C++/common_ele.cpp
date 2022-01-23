#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n1, n2, n3;
    cin >> n1 >> n2 >> n3;

    int arr1[n1], arr2[n2], arr3[n3];
    for (int i = 0; i < n1; i++)
    {
        cin >> arr1[i];
    }
    for (int i = 0; i < n2; i++)
    {
        cin >> arr2[i];
    }
    for (int i = 0; i < n3; i++)
    {
        cin >> arr3[i];
    }

    unordered_map<int, int> m1, m2, m3;
    for (int i = 0; i < n1; i++)
    {
        m1[arr1[i]]++;
    }
    for (int i = 0; i < n2; i++)
    {
        m2[arr2[i]]++;
    }
    for (int i = 0; i < n3; i++)
    {
        m3[arr3[i]]++;
    }

    vector<int> v;
    for (int i = 0; i < n1; i++)
    {
        if (m1[arr1[i]] && m2[arr1[i]] && m3[arr1[i]])
        {
            v.push_back(arr1[i]);
            m1[arr1[i]] = 0;
        }
    }
    for (int i = 0; i < v.size(); i++)
    {
        cout<<v[i]<<" ";
    }   
}