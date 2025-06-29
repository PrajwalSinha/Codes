const URL = "https://cat-fact.herokuapp.com/facts";

//let promise = fetch(URL,[options])
//get request -> get some data from the server
const getFacts = async () => {
  console.log("Getting data....");
  let response = await fetch(URL);
  console.log(response);
  console.log(response.status);//json format
  let data = await response.json();
  console.log(data[0]);
};

//terms - response
//json - javascript object notation
//json() method - returns a second promise that resolves with the result of parsing the response body text ass json.

//api request -> response(json) -> convert it from json format to js object (here the json method is used)

getFacts();