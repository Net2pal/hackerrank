//Find the number of ways that a given integer, , can be expressed as the sum of the power of unique, natural numbers.
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int recer(int i,int x,int k,int n){
    if(x<0)return 0;
    if(x==0)return 1;
    if(k==i)return 0;
    int ans=0;
    for(int j=k;j<i;j++){
        ans+=recer(i,x-pow(j,n),j+1,n);
    }
    return ans;
    
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
     int x,n;
    cin>>x>>n;
    int i=1;
    for(;i<x;i++)
        if(pow(i,n)>x)break;
    cout<<recer(i,x,1,n)<<endl;
    return 0;
}
