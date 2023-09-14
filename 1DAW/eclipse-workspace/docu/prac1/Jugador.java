package prac1;
/**
 * Clase paara el objeto jugador
 * @author s-e-r
 *
 */
public class Jugador {

	private String nombre;
	private String apellidos;
	private String apodo;
	private int dorsal;
	private String nacionalidad;
	private Fecha fecha_nac;
	private String posicion;
	private int salario;
/**
 * Constructor para un jugaador
 * @param nombre Nombrw
 * @param apellidos Apellidos
 * @param apodo Apodo
 * @param dorsal Dorsal
 * @param nacionalidad Nacionalidad
 * @param fecha_nac Nacimiento
 * @param posicion Posicion
 * @param salario Salario
 */
	public Jugador(String nombre, String apellidos, String apodo, int dorsal, String nacionalidad, Fecha fecha_nac,
			String posicion, int salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.apodo = apodo;
		this.dorsal = dorsal;
		this.nacionalidad = nacionalidad;
		this.fecha_nac = fecha_nac;
		this.posicion = posicion;
		this.salario = salario;
	}
	/**
	 * Constructor
	 */
	public Jugador() {
	}
	/**
	 * Getter nombre
	 * @return a
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Setter de nombre
	 * @param nombre Nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Getter de apellidos
	 * @return Apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Setter de apellidos
	 * @param apellidos Apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * Getter de apodo
	 * @return a
	 */
	public String getApodo() {
		return apodo;
	}
	/**
	 * Setter de apodo
	 * @param apodo Apodo
	 */
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	/**
	 * Getter de dorsal
	 * @return a
	 */
	public int getDorsal() {
		return dorsal;
	}
	/**
	 * Setter de dorsal
	 * @param dorsal Dorsal
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	/**
	 * Getter de nacionalidad
	 * @return a
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * Setter de Nacionalidad
	 * @param nacionalidad Nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * Getter de nacimiento
	 * @return a
	 */
	public Fecha getFecha_nac() {
		return fecha_nac;
	}
	/**
	 * Setter de Nacimiento
	 * @param fecha_nac Nacimiento
	 */
	public void setFecha_nac(Fecha fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	/**
	 * Getter de posicion
	 * @return a
	 */
	public String getPosicion() {
		return posicion;
	}
	/**
	 * Setter de posicion
	 * @param posicion Posicion
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	/**
	 * Getter de salario
	 * @return a
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * Setter de salario
	 * @param salario Salario
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Jugador: "+ nombre +
				"\nApellidos= " + apellidos + 
				"\nApodo= " + apodo + 
				"\nDorsal= " + dorsal + 
				"\nNacionalidad= " + nacionalidad + 
				"\nFecha de nacimiento= " + fecha_nac + 
				"\nPosicion= " + posicion + 
				"\nSalario= " + salario;
	}

}
