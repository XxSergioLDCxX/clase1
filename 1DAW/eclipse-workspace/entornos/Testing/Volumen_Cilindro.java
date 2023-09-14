package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Volumen_Cilindro {

	private Cilindro cil;
	
	public void escenario() {
		
		cil = new Cilindro();
		
	}
	
	@Test
	
	public void testVolumen() {
		
		escenario();
		double actual = cil.volumen(3, 4);
		double esperado = 113.04;
		assertEquals(esperado, actual);
		
		
	}

}
