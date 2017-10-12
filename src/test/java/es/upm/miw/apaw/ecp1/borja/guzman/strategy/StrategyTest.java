package es.upm.miw.apaw.ecp1.borja.guzman.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void testSum() {
		Context context = new Context(new OperationAdd());
		assertEquals(15, context.executeStrategy(10, 5));
	}

	@Test
	public void testSubstract() {
		Context context = new Context(new OperationSubstract());
		assertEquals(5, context.executeStrategy(10, 5));
	}

	@Test
	public void testMultiply() {
		Context context = new Context(new OperationMultiply());
		assertEquals(50, context.executeStrategy(10, 5));
	}
}
