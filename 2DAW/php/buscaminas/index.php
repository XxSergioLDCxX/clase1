<?php
 require_once 'database.php';

 header("Content-Type:application/json");
 $requestMethod = $_SERVER["REQUEST_METHOD"];

 //Variables para la base de datos 
 $sv = 'localhost';
 $user = 'root';
 $pass = '';
 $dtb = 'buscaminas';

 //Conexion a la base de datos
 $conexion = conectarBaseDatos($sv, $user, $pass, $dtb);
       
 
        $usuario = "Sergio";
        $contrasena = "add123";

       $auth = loggin($conexion,$usuario,$contrasena);

       if ($auth == true) {
        
        switch ($requestMethod) {
            case "POST":
                    
        
        
                $response = array("mensaje" => "Solicitud POST recibida.");
        
                break;
            case "GET":
                //crear el tablero si no existe

        
                $response = array("mensaje" => "Solicitud GET recibida.");
                break;
        
            case "PUT":
        
                $response = array("mensaje" => "Solicitud PUT recibida.");
        
                break;
            default:
        
                header("HTTP/1.1 405 Verbo no soportado");
                $response = array("error" => "Método HTTP no válido.");
        }


       }else{

        $response = array("mensaje" => "Usuario o contraseña incorrecta.");

       }


echo json_encode($response);

 













 $conexion = desconectarBaseDatos($conexion);