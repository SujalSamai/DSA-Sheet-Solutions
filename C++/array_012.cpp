// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

#include<iostream>
using namespace std;
int main()
{
    int a[100], n, i;
    cin>>n; 
    for(i=0; i<n; i++)
    cin>>a[i]; 
    int l = 0;
    int h = n - 1;
    int m = 0;
        while (m <= h) {  
            switch (a[m]) { 
            case 0:
                swap(a[l++], a[m++]); 
                break;

            case 1:
                m++;
                break;
            
            case 2:
                swap(a[m], a[h--]);             
                break;
            }
        }
        
    for(int i=0; i<n; i++)
    {
        cout<<a[i]<<" ";
    }

}