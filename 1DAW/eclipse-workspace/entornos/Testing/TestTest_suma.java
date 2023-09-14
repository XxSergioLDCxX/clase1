package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTest_suma {
	private Test_Suma mates;
	
	public void escenario() {
		
	mates = new Test_Suma();
		
	}
	
	
	@Test
	public void testSumas() {
		escenario();
		int actual = mates.sumas(7, 0);
		int esperado = 7;
		assertEquals(esperado, actual);
		
	}
}
