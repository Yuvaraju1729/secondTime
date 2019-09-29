package task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		Square s=new Square();
		int output=s.getSquare(5);
		assertEquals(25,output);
	}

}
