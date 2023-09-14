<?php

//declarar array 2 formas

$vec1 = array();
$vec2 = [
        '1A' => 'hol',
        '2A' => 'hol',
        '3A' => 'hol',
        '4A' => 'hol',
];

//recorrer array forma clasica

for($i = 0; $i < count($vec1); $i++){

    //usar i para accdeder a las posiciones del array

    echo $vec1[$i] . '<br>';


}

//forma regular de recorrer

foreach ($vec2 as $key => $value) {
    # code...
}