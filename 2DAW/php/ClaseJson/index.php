<?php
//establece que va a devolver JSON
header("Content-Type:application/json");

//guarda el metodo que se va a emplear 
$requestMethod = $_SERVER["REQUEST_METHOD"];
$paths = $_SERVER['REQUEST_URI'];


 if($requestMethod == 'GET'){

    $v = [1,2,3,4];
    header("HTTP/1.1 200 Todo ok");

    echo json_encode($v);


 }else {

header("HTTP/1.1 405 Verbo no soportado");


 }

