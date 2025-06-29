//functions - first class citizens
// function add(a,b){
//   return a+b;
// }
// console.log(add); //give the function
// console.log(add(2,3));//result
//i can assign function into a variable, i can also pass it as a argument
let sum = function (a,b){
  return a+b;
}
//arrow functions
let mul = (a,b) =>{
  return a*b;
}

//if it is one line
let div = (a,b) => a/b;
let diff = function (a,b){
  return a-b;
}

function operate(operationFunction,a,b){
  return operationFunction(a,b);
}

console.log(operate(sum,2,3));
console.log(operate(diff,2,3));