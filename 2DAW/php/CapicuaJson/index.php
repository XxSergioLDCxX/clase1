<?php

require_once 'lib.php';

header("Content-Type:application/json");

$requestMethod = $_SERVER["REQUEST_METHOD"];
$paths = $_SERVER['REQUEST_URI'];


$argumentos = explode('/',$paths);

if($requestMethod == 'GET'){

   
    header("HTTP/1.1 200 Todo ok");

    $n = $argumentos[1];

    print_r($argumentos);    


 }else {

header("HTTP/1.1 405 Verbo no soportado");


 }