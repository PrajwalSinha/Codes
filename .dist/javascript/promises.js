//promises
//to handle asynchronous operations
// promises - object that is going to show the state
//3 states - pending,fulfilled,rejected

function getData(){
  return new Promise(()=>{
    setTimeout(()=>{
      resolve('data fetched');
    },5000);
  });
}

getData()
  .then(result=>{
    console.log(result);
  })
  .catch(error=>{
    console.log(error);
  })


  async function handleData(){
    try{
      const result = await getData();
      console.log(result);
    }catch(error) {
      console.log(error);
    }
  }

  handleData();