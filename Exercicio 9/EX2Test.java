import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EX2Test {

	@Test
	public void testFooThrowsIndexOutOfBoundsException() {

		assertThrows (IndexOutOfBoundsException.class, () -> {
			foo.doStuff();
		});

	}

}
