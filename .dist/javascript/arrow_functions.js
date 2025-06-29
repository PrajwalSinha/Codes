//arrow functions
//i want one function to be returned from some other function
//function + lexical scope = closure
let a = 10;
function outer(){
  function inner(){
    a=100;
    console.log(a);
  }
  return inner;
}

let returnedFuncVar = outer();
a  = 20;
a  = 80;
console.log(returnedFuncVar);
returnedFuncVar();