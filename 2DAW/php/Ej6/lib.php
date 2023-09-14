<?php


// Llenar el vector con números aleatorios
function rellenar($vector,$tamañoVector){

    for ($i = 0; $i < $tamañoVector; $i++) {
        $numeroAleatorio = rand(1, 100); // Generar un número aleatorio entre 1 y 100
        array_push($vector, $numeroAleatorio); // Agregar el número al vector
    }

    return $vector;
}

//cuenta las veces que se repite el numero elegido

function contador($vector,$comp,$rep){

    for ($i=0; $i < count($vector); $i++) { 
        if($vector[$i] == $comp){
            $rep++;
        }
    }

    return $rep;

}



