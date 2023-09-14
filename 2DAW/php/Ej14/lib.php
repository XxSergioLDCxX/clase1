<?php

//Crear array donde se encuentra la mosca
function generarPista(&$pista){
    for ($i=0; $i < 6; $i++) { 
    
        array_push($pista,'-');
    }
    array_push($pista,0);
    
    shuffle($pista);

    return $pista;
}

function darGolpe($golpe, $pista, &$win){

    if ($pista[$golpe] != 0){

        if($golpe > 0){

            if($pista[$golpe - 1] == 0){
                $pista = generarPista($pista);
            }

        }else{
            if($golpe < 6){

                if($pista[$golpe + 1] == 0){
                    $pista = generarPista($pista);
                }

            }
        }

    }else{

        $win = 1;
    }
    return $win;

    

}


