const boton = document.getElementById('boton')
var es = document.getElementById('ib1')

boton.addEventListener('click', function() {
    var es = document.getElementById('ib1')
    comprobar()
})


//  Tener un botón de Guardar con los siguentes requisitos:
// 	Se comprobará que los primeros campos del IBAN sean 4 caracteres y solo se admitirán dos valores válidos: ES76 y ES78 si no es ningun de ellos se coloreará de color rojo y se mostrá un mensaje en
function comprobar(){

    if (es == 'ES76' ) {
        alert(1)
    }else{
        alert(2)
    }
}
// 	en la parte inferior de que IBAN inválido
// 	Se comprobará que el número de cuenta es correcto de longitud
// 	Se comprobará de que el número de tarjeta tiene la longitud correcta y que solo contiene número si falla se mostrará el texto de que es incorrecto
// 	Se comprobará que el CVV tiene la longitud correcta y que sean solo números.

// Otros requisitos:
// Cuando se cambien el número de tarjeta automáticamente si el CVV esta relleno se limpiará el campo.

