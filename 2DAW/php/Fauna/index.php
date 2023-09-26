<?php

require_once 'Animales.php';
require_once 'Perro.php';
require_once 'Gato.php';

header("Content-Type:application/json");

$requestMethod = $_SERVER["REQUEST_METHOD"];

if ($requestMethod == 'GET') {

    header("HTTP/1.1 200 Todo ok");


    $perro = new Perro("Max", "Golden Retriever", 20, "Dorado");
$gato = new Gato("Whiskers", "Siamese", 10, "Blanco");

$perro->vacunar();
$perro->comer();
$perro->dormir();
$perro->sacarPaseo();
$perro->hacerRuido();
if ($perro->hacerCaso()) {
    echo "{$perro->getNombre()} hace caso.\n";
} else {
    echo "{$perro->getNombre()} no hace caso.\n";
}

$gato->vacunar();
$gato->comer();
$gato->dormir();
$gato->toserBolaPelo();
$gato->hacerRuido();
if ($gato->hacerCaso()) {
    echo "{$gato->getNombre()} hace caso.\n";
} else {
    echo "{$gato->getNombre()} no hace caso.\n";
}
}else{

    header("HTTP/1.1 405 Verbo no soportado");

}