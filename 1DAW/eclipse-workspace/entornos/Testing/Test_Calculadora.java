package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_Calculadora {
	private Calculadora cal;
	
	public void escenario() {
		
		cal = new Calculadora();
	}
	
	@Test
	public void testSuma() {
	escenario();
	int actual = cal.sumar(5, 5);
	int esperado = 10;
	assertEquals(esperado, actual);
		
	}
	
	@Test
	public void testResta() {
		escenario();
		int actual = cal.restar(10, 5);
		int esperado = 5;
		assertEquals(esperado, actual);
	}
	
	@Test
	public void testMulti() {
		escenario();
		int actual = cal.multiplicar(2, 3);
		int esperado = 6;
		assertEquals(esperado, actual);
	}
	
	@Test
	public void testDiv() {
		escenario();
		int actual = cal.dividir(10, 2);
		int esperado = 5;
		assertEquals(esperado, actual);
	}
}
