<?php
 require_once 'database.php';

 //Variables para la base de datos 
 $sv = 'localhost';
 $user = 'root';
 $pass = '';
 $dtb = 'BuscaMinas';

 //Conexion a la base de datos
 $conexion = conectarBaseDatos($sv, $user, $pass, $dtb);

 $conexion = desconectarBaseDatos($conexion);