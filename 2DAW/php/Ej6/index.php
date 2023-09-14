<?php

    require_once 'lib.php';

    // Definir el tamaño del vector

$tamañoVector = 100;

// Inicializar un array vacío para almacenar los números aleatorios

$vector = array();

//contador de numero repetido

$rep = 0;

//Numero a comparar

$comp = 33;

//rellena el array de numeros aleatorios

$vector = rellenar($vector,$tamañoVector);

//cuenta cuantas veces se repite el numero elegido

$rep = contador($vector,$comp,$rep);



echo 'Tu numero se repite ' . $rep . ' veces';