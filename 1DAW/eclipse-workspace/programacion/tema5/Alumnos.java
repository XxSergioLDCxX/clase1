package tema5;

public class Alumnos {

	private String nombre;
	private double nota_examen;
	private double nota_practica;
	private double media;
	
	
	public Alumnos(String nombre, double nota_examen, double nota_practica) {
		this.nombre = nombre;
		this.nota_examen = nota_examen;
		this.nota_practica = nota_practica;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getNota_examen() {
		return nota_examen;
	}


	public void setNota_examen(double nota_examen) {
		this.nota_examen = nota_examen;
	}


	public double getNota_practica() {
		return nota_practica;
	}


	public void setNota_practica(double nota_practica) {
		this.nota_practica = nota_practica;
	}


	public double getMedia() {
		return (nota_examen + nota_practica)/2;
	}


	public void setMedia(double media) {
		this.media = (nota_examen + nota_practica)/2;
	}


	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", nota_examen=" + nota_examen + ", nota_practica=" + nota_practica
				+ ", media=" + media + "]";
	}
	
	
	

}
