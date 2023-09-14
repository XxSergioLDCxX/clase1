package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class test_Volumen_esfera {

	private Volumen_esfera esf;
	
	public void escenario() {
		
		esf = new Volumen_esfera();
	}
	
	@Test
	public void testVolumen() {
		escenario();
		double actual = esf.volumen(5);
		double esperado = 523.5987755982989;
		assertEquals(esperado, actual);
	}
}
