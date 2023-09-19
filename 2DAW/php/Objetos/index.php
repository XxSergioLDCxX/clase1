<?php
require_once('Personaje.php');
$p = new Personaje('rafa',23);

echo $p;

$p-> setNombre('manolo');
echo $p;

echo 'la persona: '. $p->getNombre().' tiene '. $p->getEdad(). ' años';