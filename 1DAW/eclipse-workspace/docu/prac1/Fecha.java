package prac1;
/**
 * Clase objeto
 * @author s-e-r
 *
 */
public class Fecha { 

	private int anio;
	private int mes;
	private int dia;
	/**
	 * Constructor de fecha vacio
	 * @param anio variable año
	 * @param mes variable mes
	 * @param dia variable dia
	 */
	public Fecha(int anio, int mes, int dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}

	/**
	 * Constructor de fecha vacio
	 */
	public Fecha() { 
	}
	/**
	 * Getter de anio
	 * @return a
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * Setter de anio
	 * @param anio variable año
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * Getter de Mes
	 * @return a
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * Setter de Mes
	 * @param mes variable mes
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * Getter de Dia
	 * @return a
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * Setter de Dia
	 * @param dia variable dia
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	@Override
	public String toString() {
		return "Fecha [anio=" + anio + ", mes=" + mes + ", dia=" + dia + "]";
	}

}
