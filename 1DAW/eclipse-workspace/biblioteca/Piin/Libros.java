package Piin;

public class Libros {

	
		private String ISBN;
		private String titulo;
		private String autor;
		private String sipnepsis;
		private String genero;
		private boolean leido;
		
		
		public Libros(String iSBN, String titulo, String autor, String sipnepsis, String genero, boolean leido) {
			ISBN = iSBN;
			this.titulo = titulo;
			this.autor = autor;
			this.sipnepsis = sipnepsis;
			this.genero = genero;
			this.leido = leido;
	
		}


		public String getISBN() {
			return ISBN;
		}


		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}


		public String getTitulo() {
			return titulo;
		}


		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public String getAutor() {
			return autor;
		}


		public void setAutor(String autor) {
			this.autor = autor;
		}


		public String getSipnepsis() {
			return sipnepsis;
		}


		public void setSipnepsis(String sipnepsis) {
			this.sipnepsis = sipnepsis;
		}


		public String getGenero() {
			return genero;
		}


		public void setGenero(String genero) {
			this.genero = genero;
		}


		public boolean isLeido() {
			return leido;
		}


		public void setLeido(boolean leido) {
			this.leido = leido;
		}


		@Override
		public String toString() {
			return "Libros [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", sipnepsis=" + sipnepsis
					+ ", genero=" + genero + ", leido=" + leido + "]";
		}
		
		
		
		
		
		
}
