edad = 12

control = undefined

//Gestionar el control
if(edad>=1 && edad<=130){
    control=true
}else{
    control=false
}

if(!(control)==true){
    if(edad>=18){
        alert("Mayor de edad")
    }else{
    alert("Menor de edad")
    }
}else{
    alert("Edad incorrecta")
}
