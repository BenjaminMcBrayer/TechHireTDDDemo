import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class PrimeFactorsTest {

	@Test
	void factors1() {
		assertEquals(PrimeFactors.factorsOf(1), Collections.emptyList());
	}

	@Test
	void factors2() {
		List<Integer> list = new ArrayList<>(Arrays.asList(2));
		assertEquals(PrimeFactors.factorsOf(2), list);
	}

	@Test
	void factors3() {
		List<Integer> list = new ArrayList<>(Arrays.asList(3));
		assertEquals(PrimeFactors.factorsOf(3), list);
	}

	@Test
	void factors4() {
		assertEquals(PrimeFactors.factorsOf(4), new ArrayList<>(Arrays.asList(2, 2)));
	}

	@Test
	void factors5() {
		assertEquals(PrimeFactors.factorsOf(5), new ArrayList<>(Arrays.asList(5)));
	}

	@Test
	void factors6() {
		assertEquals(PrimeFactors.factorsOf(6), new ArrayList<>(Arrays.asList(2, 3)));
	}

	@Test
	void factors7() {
		assertEquals(PrimeFactors.factorsOf(7), new ArrayList<>(Arrays.asList(7)));
	}

	@Test
	void factors8() {
		assertEquals(PrimeFactors.factorsOf(8), new ArrayList<>(Arrays.asList(2, 2, 2)));
	}

	@Test
	void factors9() {
		assertEquals(PrimeFactors.factorsOf(9), new ArrayList<>(Arrays.asList(3, 3)));
	}

	@Test
	void factors12() {
		assertEquals(PrimeFactors.factorsOf(12), new ArrayList<>(Arrays.asList(2, 2, 3)));
	}

	@Test
	void factors15() {
		assertEquals(PrimeFactors.factorsOf(15), new ArrayList<>(Arrays.asList(3, 5)));
	}
	
	@Test
	void factors25() {
		assertEquals(PrimeFactors.factorsOf(25), new ArrayList<>(Arrays.asList(5, 5)));
	}
	
	@Test
	void factors49() {
		assertEquals(PrimeFactors.factorsOf(49), new ArrayList<>(Arrays.asList(7, 7)));
	}
	
	@Test
	void factors121() {
		assertEquals(PrimeFactors.factorsOf(121), new ArrayList<>(Arrays.asList(11, 11)));
	}
}
