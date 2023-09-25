<?php
require_once 'lib.php';
$pista = array();
$win = 0;

//generarmos la pista con la mosca
$pista = generarPista($pista);

while ($win == 0) {
    
    //dar golpe--
    $golpe = rand(0,6);

    //comprobar mosca

    $win = darGolpe($golpe, $pista, $win);
    if($win == 0){
        echo('has fallado <br>');
    }
    
};
 //var_dump($pista);
echo('ganaste');



//var_dump($pista);