#include <bits/stdc++.h>
using namespace std;

/*  write a program that accepts 4 nos, and prints the summation of 2 nos idividually*/

void inputTwoNumberrsAndPrintAddOfThem() {

  int num1,num2;
  cin >> num1 >> num2;
  cout<<num1+num2<<endl;
}

int sumOfTwoNumbers(int num1, int num2){
  int res = num1 + num2;
  return res;
}

void explainPassByValueandReference(int &x){

  x = x+10;

}

void explainPassByValueandReferenceArray(int arr[]){

  arr[0] = 100;

}

int main(){
  inputTwoNumberrsAndPrintAddOfThem();
  inputTwoNumberrsAndPrintAddOfThem();
  int res =  sumOfTwoNumbers(4,5);
  cout<<res<<endl;
  int num = 5;
  explainPassByValueandReference(num); // no is passed not the memory
  cout<<num; //so it will print 5 basically you are changing the no at int x location but if you do like int &x then you are passing it by reference

  int arr[] = {6,7,8,1,2};
  explainPassByValueandReferenceArray(arr);
  cout << arr[0]; //it is getting modified without & why? -> it already taking the reference
  /* so either you pass a copy or a reference */
  return 0;
}