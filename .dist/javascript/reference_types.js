//reference types - objects,arrays,functions
//create a object
let course = {
  title: "HHLD",
  description: "Projects",
  rating: 5
};

console.log(course);
console.log(typeof(course));//object

console.log(course.title);

//refernce vs value types
//copying by value type
let x = "messi";
let y = x;

x = "Ronaldo";

console.log(x);//only x changed
console.log(y);//y did not change

//primitive value types - String,number,boolean, Undefined, NULL, Symbol
//refernce types - objects , arrays, functions
let p = {
  name:"Neymar"
};

let q = p;

p.name = "Kross";

console.log(p);//gives the updated value
console.log(q);//gives the updated value