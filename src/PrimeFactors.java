import java.util.ArrayList;
import java.util.List;

/*Factorize a positive integer number into its prime factors.

For example:
	 1 -> []
	 2 -> [2]
	 3 -> [3]
	 4 -> [2,2]
	 5 -> [5]
	 6 -> [2,3]
	 7 -> [7]
	 8 -> [2,2,2]
	 9 -> [3,3]
	12 -> [2,2,3]
	15 -> [3,5]
*/
public class PrimeFactors {

	public static List<Integer> factorsOf(int n) {
		List<Integer> factors = new ArrayList<>();
		int divisor = 2;
		while (n > 1) {
			while (n % divisor == 0) {
				factors.add(divisor);
				n /= divisor;
			}
			++divisor;
		}
		return factors;
	}

}
