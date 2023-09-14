package tema1;

import java.util.Scanner;

public class Formulario_Registro_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Se debe almacenar el nombre de usuario, el nombre, apellidos, edad, dni, email, contraseña,
		//ciudad de residencia, nacionalidad.
		String usuario, apellidos, edad, dni, email, password, city, nacionalidad;
		
		System.out.println("Introduce el usuario: ");
		usuario = sc.next();
		
		System.out.println("Introduce tu apellido: ");
		apellidos = sc.next();
		
		System.out.println("Introduce tu edad: ");
		edad = sc.next();
		
		System.out.println("Introduce el DNI: ");
		dni = sc.next();
		
		System.out.println("Introduce el correo: ");
		email = sc.next();
		
		System.out.println("Introduce tu contraseña: ");
		password = sc.next();
		
		System.out.println("Introduce tu ciudad: ");
		city = sc.next();
		
		System.out.println("Introduce la nacionalidad: ");
		nacionalidad = sc.next();
		
		//- El nombre de usuario siempre debe tener su primera letra en mayúscula
		
		String resultado = usuario.toUpperCase().charAt(0) + usuario.substring(1, usuario.length()).toLowerCase();
		
		
		//- El nombre y los apellidos también deben tener su primera letra en mayúscula. Además, es
		//conveniente que, si en un apellido se identifica un guión (apellido compuesto), se separe en
		//dos apellidos mediante un espacio, puesto que así se almacenará en la base de datos.
		
		String result = apellidos.replace(" ","-");
		System.out.println(result);

		
		//- La edad del usuario se calculará automáticamente, solicitándole al usuario únicamente su año
		//de nacimiento.
		
		
		//- El dni debe contener 8 números y 1 número. Cualquier otro formato introducido devolverá
		//un mensaje de error y se solicitará de nuevo introducir el dni correctamente.
		
		
		//- Puesto que nuestros clientes dicen que solo trabajan con su dominio de correo, deberemos
		//solicitar únicamente la parte izquierda, es decir, no será necesario que se escriba por consola
		//el dominio de mail. Por ejemplo: si mi correo es dgonzalez@efamoratalaz.com, solo será
		//necesario escribir “dgonzalez” en la consola, y la aplicación completará automáticamente la
		//dirección de correo.
		
		
		//- En principio, la ciudad de residencia y la nacionalidad no tendrán ninguna excepción, salvo la
		//de que sólo se pueden introducir Strings, ya que no es coherente que un usuario tenga como
		//nacionalidad “1234”.
		
		
		//- Las contraseñas son la primera medida de seguridad que se establece en un sistema, por lo
		//que tendremos que crear una política de contraseñas en función de lo que exijan nuestros
		//clientes. Pensar en las típicas restricciones que ya conocemos cuando nos registramos en un
		//sitio web e implementarlo en esta aplicación. No hay ningún diseño especificado, por lo que
		//podéis crear las contraseñas a vuestro gusto. Un ejemplo podría ser que las contraseñas
		//tienen que tener la primera letra en mayúsculas y debe incluir un guion. Por lo tanto, si las
		//dos contraseñas solicitadas no coinciden o si una de ellas no está escrita de acuerdo a las
		//reglas, se pedirá de nuevo que se introduzca la contraseña.
		
		
		//- Finalmente, mostrar por pantalla dos opciones: confirmar y cancelar. Si el usuario cancela el
		//registro, se terminará la ejecución de la aplicación (utiliza las estructuras de salto). Si el
		//usuario confirma, mostrar un mensaje de “registro satisfactorio” en la consola junto con un
		//informe que incluya los datos del usuario registrado de forma adecuada
	}

}
