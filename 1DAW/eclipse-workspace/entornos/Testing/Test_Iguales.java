package Testing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test_Iguales {

	private Iguales ig;
	
	public void escenario() {
		
		ig = new Iguales();
	}
	
	@Test
	public void testIguales() {
		escenario();
		assertTrue(ig.igual(6, 6));
	}
}
