package mathemathicOperations;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticSequenceTest {

	@Test
	public void testReturnFilledSequence() {
		assertEquals("ArithmeticSequenceIsWrong", new int[]{1, 2, 3}[0], ArithmeticSequence.returnFilledSequence(1,1,3)[0]);
		assertEquals("ArithmeticSequenceIsWrong", new int[]{1, 2, 3}[1], ArithmeticSequence.returnFilledSequence(1,1,3)[1]);
		assertEquals("ArithmeticSequenceIsWrong", new int[]{1, 2, 3}[2], ArithmeticSequence.returnFilledSequence(1,1,3)[2]);
	}

}
