import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EX1Test {

	@Test
	void testEX1Build() {
		EX1 fibonacci9= new EX1(9);
		int n34= 34;
		
		assertEquals(n34, fibonacci9.fib);
	}

}
