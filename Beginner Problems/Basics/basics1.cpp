#include <bits/stdc++.h>
using namespace std;

int main(){
//if - tuf is amazing then it will print tuf is becuase string does not include spaces
  string bdate;
  string num;
  cin >> bdate >> num;

  cout << bdate << endl << num;

  string str1,str2;
  getline(cin,str1); // read the string until a next line is trigeered.
  getline(cin,str2);
  cout << str1 << endl << str2;
  return 0;
}