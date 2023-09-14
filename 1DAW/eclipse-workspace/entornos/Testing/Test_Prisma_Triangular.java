package Testing;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class Test_Prisma_Triangular {

	private Primas_Triangular pr;
	
	public void escenario() {
		
		pr = new Primas_Triangular();
	}
	
	@Test
	public void area() {
		
		escenario();
		double actual = pr.volumne(2, 2, 2);
		double esperado = 4;
		assertEquals(esperado, actual);
		
		
		
		
	}
}
