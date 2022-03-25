let user;

document.getElementById("login-form").addEventListener("submit", 


async function getRmb(event){
    //this is to stop the form from reloading
    event.preventDefault();

    //retrieve input elements from the dom
    let usernameInputElem = document.getElementById("username");
    let passwordInputElem = document.getElementById("password");

    //get values from the input elements and put it into an object
    let user = {
        username: usernameInputElem.value,
        password: passwordInputElem.value
    }

async function createReimbRequest(event){

    event.preventDefault();

    let amountInputElem = document.getElementById("amount");
    let userInputElem = document.getElementById("username");
    let typeIdInputElem = document.getElementById("select-box");

    let request = {
        amount: amountInputElem.value,
        userID: user.id,
        typeID: typeIdInputElem.value,
    }
}
    //sending http request

    let response = await fetch("http://localhost:9000/reimb" + userId)

    //retrieve response body
    let responseBody = await response.json();
    
    console.log(responseBody)
})

