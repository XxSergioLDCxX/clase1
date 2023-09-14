package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_rectanguloP {

	private Rectangulo_P per;
	
	public void escenario() {
		
		per = new Rectangulo_P();
		
	}
	
	@Test
	
	public void testPerimetro() {
		escenario();
		int actual = per.perimetro(5, 2);
		int esperado = 10;
		assertEquals(esperado, actual);
		
		
	}
}
