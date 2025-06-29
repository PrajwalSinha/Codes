//callbacks
//event queue
//event loop
function fetchData(callback) {
  setTimeout( () => {
    let data = 'fetched data';
    callback(data,null);
  },5000);
}
function handleData(data,error){
  if(error){
    console.error(error);
  }else{
    console.log(data);
  }
}
console.log('start';)
fetchData(handleData);