fetch('https://jsonplaceholder.typicode.com/users')
  .then((respone) => respone.json())
  .then((data) => console.log(data))
  .catch((error) => console.log(err));
