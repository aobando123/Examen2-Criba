package criba.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import criba.CribaEratostenes;

public class CribaEratostenesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testRetornarNumerosPrimosDe5() {
		ArrayList<Integer> primos = CribaEratostenes.generaCriba(5);
		assertEquals(3, primos.size());
		assertEquals(2, primos.get(0).intValue());
		assertEquals(5, primos.get(2).intValue());
	}
	
	@Test
	public void testNoRetornaNumerosPrimosCon0() {
		ArrayList<Integer> primos = CribaEratostenes.generaCriba(0);
		assertEquals(0, primos.size());
	}
	@Test
	public void testNoRetornaNumerosPrimosCon1() {
		ArrayList<Integer> primos = CribaEratostenes.generaCriba(1);
		assertEquals(0, primos.size());
	}
	
	
	@Test
	public void testInsertarNumerosNegativos() {
		ArrayList<Integer> primos = CribaEratostenes.generaCriba(-2);
		assertEquals(0, primos.size());
	}

}
