//functions - refernce and object
//const-value can not be changed,let- ,var
//in var hoisting is possible but nor in let and const
//const and let are block scoped
//var is functional scoped
createCourse('hld'); // shows in console
console.log(x); // undefined
function createCourse(coursename){
  console.log('creating '+ coursename);
}
var x = 10;
console.log(x); // x = 10
createCourse('lld');

//how js is executed - 
//run js code -> global execution context -> memory phase -> synchronous single threaded language (one by one code execute) - code phase ->

//Hoisting is able to access variables and functions before actually initializing them.
//Execution Context
//1. memory phase - variable environment
//2. code phase - thread of execution