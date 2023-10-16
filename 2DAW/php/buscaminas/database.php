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


        }

        function agregarUsuario($conexion, $usuario,$pass,$correo,$ad = false){
          $sql = "INSERT INTO usuarios (nombre_usuario, contrasena, correo, administrador) VALUES ('$usuario', '$pass', '$correo', '$ad')";
          if ($conexion->query($sql) === TRUE) {
            echo "Usuario $usuario agregado con éxito.<br>";
        } else {
            echo "Error al agregar el usuario $usuario: " . $conexion->error . "<br>";
        }
        }

        function loggin($conexion,$usuario,$contrasena){
           
          
          //MIRAR NOMBRE DE USUARIO Y CONTRASEÑA
        $sql = "SELECT nombre_usuario, contrasena FROM usuarios WHERE nombre_usuario = '$usuario'";
        $result = $conexion->query($sql);
          if ($result->num_rows == 1) {
            $row = $result->fetch_assoc();
            $contrasena_almacenada = $row["contrasena"];
        
            // Verificar si la contraseña ingresada coincide con la contraseña almacenada
            if ($contrasena === $contrasena_almacenada) {
                
                return true;
            } else {
          
                return false;
            }
        } else {
            
            return false;
        }
        }

          