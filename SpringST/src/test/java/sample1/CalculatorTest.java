package sample1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorTest t = new CalculatorTest();
		t.testSum();
	}
	
	@Test
	public void testSum(){
		Calculator c = new Calculator();
		double result = c.sum(10, 20);
		assertEquals(20, result,10);
	}

}
