//map
const nums = [1,2,3,4,5];
console.log(nums);

const doubleNums = nums.map((num)=>
  2*num
);

//filter

const evens = nums.filter((num)=>
  num%2 === 0
);
console.log(evens);


//reduce
const sum = nums.reduce((accumulator,num)=>accumulator + num, 0);
console.log(sum);