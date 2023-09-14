package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Test_Area_Circulo {

	private Area_Ciruclo ar;
	
	public void escenario() {
		
		ar = new Area_Ciruclo();
	}
	
	@Test
	public void testRadio() {
		
		escenario();
		double actual = ar.area(5);
		double esperado = 78.5	;
		assertEquals(esperado, actual);
		
	}

}
