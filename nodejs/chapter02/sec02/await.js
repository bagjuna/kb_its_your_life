async function init() {
    try {
        const response = await fetch('https://jsonplaceholder.typicode.com/users');
        const users =  response.json();
        console.log(users);
    } catch (err) {
        console.error(err);
    }
}

init();
