let res = document.getElementById("resultado");
let suma = function(){
    if(document.getElementById("termino1").value === "" || document.getElementById("termino2").value === ""){
        window.alert("|==ERROR==|==Introduzca todos los campos==|");
    } else {
        let op1 = document.getElementById("termino1").value;
        let op2 = document.getElementById("termino2").value;
        res.textContent = parseFloat(op1) + parseFloat(op2);
    }
}
let resta = function(){
    if(document.getElementById("termino1").value === "" || document.getElementById("termino2").value === ""){
        window.alert("|==ERROR==|==Introduzca todos los campos==|");
    } else {
        let op1 = document.getElementById("termino1").value;
        let op2 = document.getElementById("termino2").value;
        res.textContent =  parseFloat(op1) - parseFloat(op2);
    }
}
let multi = function(){
    if(document.getElementById("termino1").value === "" || document.getElementById("termino2").value === ""){
        window.alert("|==ERROR==|==Introduzca todos los campos==|");
    } else {
        let op1 = document.getElementById("termino1").value;
        let op2 = document.getElementById("termino2").value;
        res.textContent = parseFloat(op1) * parseFloat(op2);
    }
}
let div = function(){
    if(document.getElementById("termino1").value === "" || document.getElementById("termino2").value === ""){
        window.alert("|==ERROR==|==Introduzca todos los campos==|");
    } else {
        let op1 = document.getElementById("termino1").value;
        let op2 = document.getElementById("termino2").value;
        let result = parseFloat(op1) / parseFloat(op2);
        if (Number.isFinite(result)){
            res.textContent = result
        } else {
            res.textContent = "|==ERROR==|==Resultado infinito o inválido==|" + result
        }
        
    }
}
