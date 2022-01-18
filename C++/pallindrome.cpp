#include <bits/stdc++.h>
using namespace std;

int main()
{
    string str, rev;
    cin >> str;
    temp = str;
    int len = str.length();
    int i = len - 1;
    while (i >= 0)
    {
        rev = rev + str[i];
        i--;
    }
    if(rev==str){
        cout<<"Pallindrome"<<endl;
    }
    else{
        cout<<"Not"<<endl;
    }
}