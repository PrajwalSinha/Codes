#include <bits/stdc++.h>
using namespace std;

int main(){
//given a age, print "adult" if age>=18, or print "Teen"
//if age>=18 print "adult"
//if age < 18 and age>=10, print "teen"
//if age < 10, print "child"

  int age;
  cin >> age;

  if(age>=18) {
    cout << "Adult";
  }
  else if(age < 18 && age >= 10){
    cout << "teen";
  }
  else{
    cout<<"child";
  }
  return 0;
}