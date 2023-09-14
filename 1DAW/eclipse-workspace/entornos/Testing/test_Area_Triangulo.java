package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class test_Area_Triangulo {

	private Area_Triangulo ar;
	
	public void escenario() {
		
		ar = new Area_Triangulo();
		
	}
	@Test
	public void testArea_Triangulo() {
		escenario();
		int acutal = ar.area(6, 3);
		int esperado = 9;
		assertEquals(esperado, acutal);
		
		
	}
	
}
