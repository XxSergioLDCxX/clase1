var numero = [1,2,3,4,27]

numero.push(5)

for (let i = 0; i < numero.length; i++) {
    
    console.log(numero[i])

}

numero.pop()
for (let i = 0; i < numero.length; i++) {
    
    console.log(numero[i])

}
Math.random(6)

console.log(Math.round(Math.random(0)*50))

var numeroMayorQue25 = numero.find(numero => numero > 25);

console.log(numeroMayorQue25)

var sublista = numero.slice(0,2)

console.log(sublista)