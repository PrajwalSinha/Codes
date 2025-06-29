#include<bits/stdc++.h>
using namespace std;

/* 
Problem Statement: 
You are given three integers, a,b, and c, 
print which of these integers is the largest. 
if two or more integers are equal and are largest, 
then print any of them.
*/

int main(){
  int a,b,c;
  cin>>a>>b>>c;

  if(a>=b){

    if(a>=c){
      cout<<"Largest is A";
    }
    else{
      cout<<"Largest is C";
    }
  }

  else if(b>=c){
    cout << "B is the largest";
  }

  else {
    cout << "C is the largest";
  }

}