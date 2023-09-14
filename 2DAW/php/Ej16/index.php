<?php

$horas = 0;
$minutos = 0;
$segundos = 0;

if($segundos >= 60){

    $minutos++;
    $segundos = $segundos - 60;

}
if($minutos>= 60){

    $horas++;
    $minutos = $minutos - 60;

}
if($horas >= 24){

    $horas = $horas - 24;

}