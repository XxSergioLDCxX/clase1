<?php
       

        function conectarBaseDatos($sv,$user,$pass,$dtb){

             /** ****************** Conectar ************************* */
        // Utilizando la forma procedimental.
        $conexion = mysqli_connect($sv, $user,$pass, $dtb);
        if (!$conexion) {
            print "Fallo al conectar a MySQL: " . mysqli_connect_error();
            die();
        }
            return $conexion;
        }

        function desconectarBaseDatos($conexion){

      /******************** Cerrar la conexión *********************/
      mysqli_close($conexion);
      print "Conexión 2 cerrada" . "<br>";


        }

          