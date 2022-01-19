#include <bits/stdc++.h>
using namespace std;
void rotation(string str1, string str2)
{
    string temp;
    temp = str1 + str1;
    if (temp.find(str2) != '\0')
    {
        cout << "Strings are the rotation of each other" << endl;
    }
    else
    {
        cout << "Strings are not the rotation of each other" << endl;
    }
}
int main()
{
    string str1, str2, temp;
    cin >> str1 >> str2;

    if (str1.length() == str2.length())
    {
        rotation(str1, str2);
    }
    else
    {
        cout << "Length of both the strings must be same!" << endl;
    }

    return 0;
}