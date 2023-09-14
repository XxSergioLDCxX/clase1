var nombre = 'sergio'
var apellido = 'lopez'
//console.log("hola", nombre, apellido)

//console.log(typeof(nombre))

var edad = 15
//console.log(typeof(edad))

var mayor = true
//console.log(typeof(mayor))

suldo();

function suldo(){
    console.log('hola', nombre, apellido);
}

if (edad >= 18) {
    
    mayor = true

    }else{
   
        mayor = false
}

console.log(mayor)