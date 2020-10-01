let user = document.getElementById("user");
let password = document.getElementById("pass");
let userRequired = document.getElementById("user-req");
let userLength = document.getElementById("user-length");
let passRequired = document.getElementById("pass-req");
let passLength = document.getElementById("pass-length");
let succes = document.getElementById("succes");

let validar = function(){
    if(user.value.length < 3 || password.value.length < 3){
        if(user.value === "" || password.value === ""){
            if(user.value === ""){
                succes.style.display = 'none';
                userLength.style.display = 'none';
                userRequired.style.display = 'block';
            } else if(user.value !== "") {
                userRequired.style.display = 'none';
            }
            if(password.value === ""){
                succes.style.display = 'none';
                passLength.style.display = 'none';
                passRequired.style.display = 'block';
            } else if(password.value !== ""){
                passRequired.style.display = 'none';
            }
        } 
        if(user.value.length < 3 && user.value !== ""){
            succes.style.display = 'none';
            userRequired.style.display = 'none';
            userLength.style.display = 'block';
        } else {
            userLength.style.display = 'none';
        }
        if(password.value.length < 3 &&  password.value !== ""){
            succes.style.display = 'none';
            passRequired.style.display = 'none';
            passLength.style.display = 'block';
        } else {
            passLength.style.display = 'none';
        }
    } else {
        userRequired.style.display = 'none';
        userLength.style.display = 'none';
        passRequired.style.display = 'none';
        passLength.style.display = 'none';
        succes.style.display = 'block';
    }
}