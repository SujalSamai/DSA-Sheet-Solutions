#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str, rev;
    cin>>str;
    int len = str.length();
    for(int i = len - 1; i>=0; i--){
        rev = rev + str[i];
    }
    // int i = len-1;
    // while(i>=0){
    //     rev = rev + str[i];
    //     i--;
    // }
    cout<<rev<<endl;
}