<?php
require_once 'Civilizacion.php';
require_once 'Rey.php';
require_once 'Aldeano.php';
require_once 'Mina.php';
require_once 'Cura.php';
// Crear civilizaciones
$espanoles = new Civilizacion("Españoles");
$bizantinos = new Civilizacion("Bizantinos");

// Crear reyes
$isabelI = new Rey("Isabel I");
$constantinoII = new Rey("Constantino II");

// Crear aldeanos
$aldeano1 = new Aldeano("Aldeano1", 200, $espanoles);
$aldeano2 = new Aldeano("Aldeano2", 250, $bizantinos);

// Crear minas
$minaOro = new Mina("ORO");
$minaPiedra = new Mina("PIEDRA", 300);

// Crear cura bizantino
$cura = new CuraBizantino();

// Simulación del juego durante 1 minuto
for ($segundos = 0; $segundos < 60; $segundos++) {
    echo "Segundos: $segundos\n";

    // Cada segundo, los aldeanos extraen ítems de la mina
    $aldeano1->extraerItem($minaOro);
    $aldeano2->extraerItem($minaPiedra);

    // Cada 2 segundos, se añade un aldeano al parque
    if ($segundos % 2 == 0) {
        $probabilidad = rand(1, 10);
        if ($probabilidad <= 4) {
            $nuevoAldeano = new Aldeano("Nuevo Aldeano", 200, $espanoles);
            echo "{$nuevoAldeano->getNombre()} se ha unido a los {$espanoles->getNombre()}.\n";
        } elseif ($probabilidad <= 6) {
            $nuevoAldeano = new Aldeano("Nuevo Aldeano", 250, $bizantinos);
            echo "{$nuevoAldeano->getNombre()} se ha unido a los {$bizantinos->getNombre()}.\n";
        }
    }

    // Cada 5 segundos, sufrimos un ataque de un cura bizantino
    if ($segundos % 5 == 0) {
        $cura->convertirAldeano($aldeano1);
        $cura->convertirAldeano($aldeano2);
    }

    echo "\n";
}

// Ver el estado final del almacén de cada civilización
echo "{$espanoles->getNombre()}: {$espanoles->getAlmacen()} ítems de {$minaOro->getTipo()} almacenados.\n";
echo "{$bizantinos->getNombre()}: {$bizantinos->getAlmacen()} ítems de {$minaPiedra->getTipo()} almacenados.\n";