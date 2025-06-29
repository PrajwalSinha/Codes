#include<bits/stdc++.h>
using namespace std;

/*
  Given the day number print which day it is of the week.
  Assume week starts from Monday and ends on Sunday. 
*/

int main(){
  int day;
  cin >> day;
  switch(day) {
    case 1:
      cout<< "Monday";
      break; // ALWAYS EXITS THE OUTERLOOP
    case 2:
      cout<< "Tuesday";
      break;
    case 3:
      cout<< "Wednesday";
      break;
    case 4:
      cout<< "Thrusday";
      break;
    case 5:
      cout<< "Friday";
      break;
    case 6:
      cout<< "Saturday";
      break;
    case 7:
      cout<< "Sunday";
      break;
    default:
      cout << "Invalid date number";
  }
  return 0;
}