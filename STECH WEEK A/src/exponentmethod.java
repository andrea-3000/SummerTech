
public class exponentmethod {
	public static int multiply (int base, int exponent) {
		if (exponent == 0) {
			return base;
		}
		base = base*multiply(base, exponent-1);
		return base;
	}

}

