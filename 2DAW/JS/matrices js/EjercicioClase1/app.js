var ordenLlegada = ['maria','sonia','clara','maria jose','eva','pilar']

//clara va al 2 y sonia al 3

var temp = ordenLlegada[2]

ordenLlegada[2] = ordenLlegada[1]

ordenLlegada[1] = temp




var eliminadas = ordenLlegada.slice(-3)

ordenLlegada.splice(-3)

console.log(eliminadas,'eliminadas')
console.log(ordenLlegada)

var eliminadosAnteriores = ['bea', 'miriam']

eliminadas = eliminadas.concat(eliminadosAnteriores)
console.log(eliminadas)

var premios =  [150,100,50]

for (let i = 0; i < premios.length; i++) {
    
    console.log(ordenLlegada[i], ' ha ganado ', premios[i], ' euros')
    

}

var numerosAl = []

for (let i = 0; i < 100; i++) {
    
    numerosAl[i] = Math.round(Math.random(0)*100)
    
}

console.log(numerosAl)

var noRepe = []

for (let i = 0; i < numerosAl.length; i++) {
    
    var aux = 0;

    for (let y = 0; y < noRepe.length; y++) {
        
        if(numerosAl[i] == noRepe[y]) {
            
            aux++

            

        }
        if (aux == 0){
            noRepe.push(numerosAl[i])
        }
    }

    

}
console.log(noRepe)
