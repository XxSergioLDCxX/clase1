<?php

$horas = 23;
$minutos = 59;
$segundos = 59;

$segundos++;

if($segundos >= 60){

    $minutos++;
    $segundos = $segundos - 60;
}
if($minutos >= 60){

    $horas++;
    $minutos = $minutos - 60;

}
if($horas >= 24){

    $horas = 0;
    print('Ha pasado un dia ' . '<br>');

}

print('Son las '. $horas . ':'. $minutos . ':' . $segundos);
