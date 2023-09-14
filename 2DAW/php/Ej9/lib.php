<?php
function esCapicua($numero) {
    // Convertir el número en una cadena para poder acceder a sus dígitos
    $numeroCadena = strval($numero);
    
    // Obtener la longitud de la cadena
    $longitud = strlen($numeroCadena);
    
    // Inicializar dos vectores para almacenar los dígitos en direcciones opuestas
    $vector1 = array();
    $vector2 = array();
    
    // Llenar los vectores con los dígitos del número
    for ($i = 0; $i < $longitud; $i++) {
        $digito = intval($numeroCadena[$i]);
        array_push($vector1, $digito);
        array_unshift($vector2, $digito);
    }
    
    // Comparar los vectores para verificar si el número es capicúa
    return $vector1 == $vector2;
}