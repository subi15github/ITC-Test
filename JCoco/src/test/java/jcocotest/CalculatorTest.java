package jcocotest;
import static org.junit.Assert.*;
import org.junit.Test;
import jcoco.Calculator;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertEquals(5,c.add(2, 3));
	}
	@Test
	public void testSubtract() {
		Calculator c=new Calculator();
		assertEquals(1,c.subtract(3, 2));
	}


}
