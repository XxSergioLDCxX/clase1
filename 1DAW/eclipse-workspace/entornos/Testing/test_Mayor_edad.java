package Testing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class test_Mayor_edad {

	private Mayor_edad may;
	
	public void escenario() {
		
		may = new Mayor_edad();
	}
	
	@Test
	public void testMayor() {
		escenario();
		assertTrue(may.mayoria(18));
		
		
		
	}
}
