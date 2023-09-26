<?php
require_once 'Parque.php';
require_once 'Animal.php';

header("Content-Type:application/json");

$requestMethod = $_SERVER["REQUEST_METHOD"];

if ($requestMethod == 'GET') {
    header("HTTP/1.1 200 Todo ok");


    // Crear el parque y agregar algunos animales
$parque = new Parque(10);
$parque->agregarAnimal(new Animal("Rex", "Perro"));
$parque->agregarAnimal(new Animal("Whiskers", "Gato"));

// Simulación del parque
for ($tiempo = 0; $tiempo < 60; $tiempo++) {
    echo "Tiempo: $tiempo segundos\n";
    if ($tiempo % 10 == 0) {
        // Aparece un nuevo animal cada 10 segundos
        $nuevoAnimal = new Animal("Nuevo", "Desconocido");
        $parque->agregarAnimal($nuevoAnimal);
    }

    if ($tiempo % 2 == 0) {
        // Los animales hacen acciones cada 2 segundos
        $parque->hacerAcciones();
    }

    if ($tiempo % 15 == 0) {
        // Los animales cambian de posición cada 15 segundos
        $parque->moverAnimales();
    }

    if ($tiempo % 20 == 0) {
        // Algunos animales abandonan el parque cada 20 segundos
        $parque->abandonarAnimales();
    }

    echo "\n";
}

}else {
    header("HTTP/1.1 405 Verbo no soportado");

}

