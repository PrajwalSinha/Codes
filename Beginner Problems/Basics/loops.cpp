#include <bits/stdc++.h>
using namespace std;

/* Take input of 10 numbers and print it. */

int main(){
  //initializer, break (valid break statement), increment/decrement
  for(int i=5;i<=100;i=i+5){
    cout << i << endl;
  }
  //while loop
  int i = 5;
  while(i<=150){
    cout << i << endl;

    i = i + 5;
  }
  // do while loop
  int i = 60;
  do{
    cout << i << endl;
    i=i+5;
  }while(i<=50);

  return 0;
}