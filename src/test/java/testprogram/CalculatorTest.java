package testprogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator cal = new Calculator();
		cal.CalcAdd(10, 20);
		assertEquals(30,cal.getResult());
	}

}
