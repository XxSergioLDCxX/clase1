// Expresión regular para un número entero positivo
const regexEnteroPositivo = /^[1-9]\d*$/;

// Expresión regular para un número entero negativo
const regexEnteroNegativo = /^-?[1-9]\d*$/;

// Expresión regular para una matrícula de coche española
const regexMatricula = /^\d{4}[A-Z]{3}$/;

// Expresión regular para un DNI español (sin validar la letra)
const regexDNI = /^\d{8}[A-HJ-NP-TV-Z]$/;

// Expresión regular para verificar si un número es binario
const regexBinario = /^[01]+$/;

// Expresión regular para verificar un número octal
const regexOctal = /^[0-7]+$/;

// Expresión regular para verificar si un número es hexadecimal
const regexHexadecimal = /^[0-9A-Fa-f]+$/;

// Ejemplos de datos para validar
const numeros = ["12345", "-6789", "1234ABC", "12345678X", "010101", "567", "1A2B3C", "GHIJKL", "1F3aBc"];

// Validar y mostrar los resultados
numeros.forEach(numero => {
  console.log(`Número: ${numero}`);
  console.log(`Entero Positivo: ${regexEnteroPositivo.test(numero)}`);
  console.log(`Entero Negativo: ${regexEnteroNegativo.test(numero)}`);
  console.log(`Matrícula Española: ${regexMatricula.test(numero)}`);
  console.log(`DNI Español: ${regexDNI.test(numero)}`);
  console.log(`Binario: ${regexBinario.test(numero)}`);
  console.log(`Octal: ${regexOctal.test(numero)}`);
  console.log(`Hexadecimal: ${regexHexadecimal.test(numero)}`);
  console.log("-----------------------------");
});
