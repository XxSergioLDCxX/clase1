package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Test_Rectangulo {

	private Rectangulo rec;
	
	public void escenario() {
		
		rec = new Rectangulo();
	}
	
	
	@Test
	
	public void testArea() {
		
		escenario();
		int actual = rec.rectangulo1(5, 2);
		int esperado = 14;
		assertEquals(esperado, actual);
		
		
	}
	
}
