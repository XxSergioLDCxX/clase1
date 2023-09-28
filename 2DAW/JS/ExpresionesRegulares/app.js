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

// Ejemplos de datos para validar
const numeros = ["12345", "-6789", "1234ABC", "12345678X", "010101", "567", "1A2B3C", "GHIJKL", "1F3aBc"];

// Validar y mostrar los resultados
