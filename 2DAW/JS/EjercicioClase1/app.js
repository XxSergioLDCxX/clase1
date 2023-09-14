var nombre1 = 'jose'
var nombre2 = 'maria'
var nombre3 = 'sonia'

var priapell1 = 'hernandez'
var priapell2 = 'ruiz'
var priapell3 = 'paton'

var segapell1 = 'morales' 
var segapell2 = 'garcia'
var segapell3 = 'gonzalez'

var edad1 = 18 
var edad2 = 14
var edad3 = 20

var mayorEdad1 = false
var mayorEdad2 = false
var mayorEdad3 = false

console.log('hola', nombre1, priapell1, segapell1)
console.log('hola', nombre2, priapell2, segapell2)
console.log('hola', nombre3, priapell3, segapell3)


mayorEdad1 = validadEdad(edad1,mayorEdad1)
mayorEdad2 = validadEdad(edad2,mayorEdad2)
mayorEdad3 = validadEdad(edad3,mayorEdad3)

var anosTtotales =sumaEdad()
console.log(anosTtotales)

finalizar(mayorEdad1,nombre1,priapell1,segapell1)
finalizar(mayorEdad2,nombre2,priapell2,segapell2)
finalizar(mayorEdad3,nombre3,priapell3,segapell3)

var i = 0;
do {

console.log(i+1 )

i++
} while (i<20);




function validadEdad(edad, mayor){

if (edad >= 18){
    mayor = true
}else{
    mayor = false
}

return mayor

}




function sumaEdad(){
var anosTtotales = edad1 + edad2 + edad3

return anosTtotales
}





function finalizar(mayor,nombre,ap1,ap2){

if(mayor){
    console.log(nombre,ap1,ap2,'es mayor de edad')
}else{
    console.log(nombre,ap1,ap2,'es menor de edad')
}


}