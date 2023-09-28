// 1) Realiza una expresión regular para comprobar un número entero positivo
let positivo = /^[1-9]*$/
console.log(positivo.test('32131'))

// 2) Realiza una expresión regular para comprobar un número entero negativo  
let negativo =/^-[\d]+$/
console.log(negativo.test('-32131'))

//3) Realiza una expresión regular para comprobar una matrícula de coche española
let matricula = /[0-9]{4}[^AEIOUaeiou]{3}$/
console.log(matricula.test('1234DBC'))

//4) Realiza una expresión regular para comprobar un dni (no validar si la letra es correcta solo si está bien formado)
    let dni = /^[0-9]{8}[A-HJ-NP-TV-Z]{1}$/
    console.log(dni.test('12345678Z'))


// 5) Realiza una expresión regular para comprobar si un número es binario
let binario = /^[0-1]+$/
console.log(binario.test('01001'))


// 6) Realiza una expresión regular para comprobar un número octal
let octal = /^[0-7]+$/
console.log(octal.test('1234567'))

// 7) Realiza una expresión regular para comprobar si un número es hexadecimal
let hex = /^[0-9a-fA-F]+$/
console.log(hex.test('123456789abcdefABCDEF'))

//8)Realizar una expresión regular para validar un usuario de discord el formato que tiene que tener es un nombre que puede contener letras minúsculas y numero pero no _ con una longitud mínima de 5 y máximo 15. Una almohadilla y un número de longitud 6.
let disc = /^[a-z0-9]{5,15}#\d{6}$/
console.log(disc.test('abcdegtfo#123456'))

//9)Realizar un método js que reciba un String y mediante expresión regular comprobar que la primera letra sea mayúscula y tenga una longitud entre 3 y 20. Si la primera letra no es mayúscula devolver el string con la primera en mayus.
function validarString(inputString) {
    // Expresión regular para verificar si la primera letra es mayúscula
    let regex = /^[A-Z]/;
  
    // Verificar si la primera letra es mayúscula
    if (!regex.test(inputString)) {
      // Si la primera letra no es mayúscula, convertirla a mayúscula
      inputString = inputString.charAt(0).toUpperCase() + inputString.slice(1);
    }
  
    // Verificar la longitud del string
    if (inputString.length >= 3 && inputString.length <= 20) {
      return inputString;
    } else {
      return "El string debe tener una longitud entre 3 y 20 caracteres.";
    }
  }

//10)Realizar una expresión que valide una fecha, pero con algunas excepciones, que los días y los meses sean correctos solo que este bien formado con el siguiente formato: dd/mm/aaaa
let fecha =/^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/[1-9]{4}$/
console.log(fecha.test('01/12/1999'))