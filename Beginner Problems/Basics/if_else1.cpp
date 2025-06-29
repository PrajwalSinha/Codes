#include <bits/stdc++.h>
using namespace std;

/*
Given a marks of a astudent, tell us the grade he is getting following the below rules
- Grade A (>=90)
- Grade B (>=70 and <90)
- Grade C (>=50 and <70)
- Grade D (>=35 and <50)
- Fail (<35)
*/

int main(){
  int marks;
  cin >> marks;

  if(marks>=90){
    cout << "Grade " << 'A' <<endl;
  }
  else if(marks>=70){
    cout << "Grade " << 'B' <<endl;
  }
  else if(marks>=50){
    cout << "Grade " << 'C' <<endl;
  }
  else if(marks>=35){
    cout << "Grade " << 'D' <<endl;
  }
  else{
    cout << "Fail" << endl; 
  }
  return 0;
}