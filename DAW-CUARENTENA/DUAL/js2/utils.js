let res = document.getElementById("operacion");
let limpiar = function () {
    if (res.value !== "") {
        res.value = "";
    }
}
let setValue = function (valor) {
    if (res.value === "|==ERROR==|"){
        res.value = valor;
    } else {
        res.value += valor;
    }
}
let calcular = function () {
    try {
        if(res.value !== "" || isFinite(eval(res.value))){
            res.value = eval(res.value);
        } else {
            res.value = "|==ERROR==|";
        }
    } catch (e) {
        console.log("|==ERROR==|");
    }
}