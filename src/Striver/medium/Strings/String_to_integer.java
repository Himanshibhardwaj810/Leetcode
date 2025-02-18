package Striver.medium.Strings;

public class String_to_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi(" -042"));

	}

	public static int myAtoi(String s) {
		s = s.trim();
		int i = 0;
		int sign = 1;
		int result = 0;
		if (s.isEmpty())
			return 0; // Return 0 if the string is empty
		if (s.charAt(i) == '-') {
			sign = -1;
			i++;
		} else if (s.charAt(i) == '+') {
			i++;
		}
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			int digit = s.charAt(i) - '0';
			if (result > (Integer.MAX_VALUE - digit) / 10) {// But since result is always positive, we only check for
															// Integer.MAX_VALUE overflow before applying the sign.
				if (sign == 1) {
					return Integer.MAX_VALUE;
				} else {
					return Integer.MIN_VALUE;
				}
			}
			result = (result * 10) + digit;
			i++;

		}
		return result * sign;
	}

	// @nd easy
	public static int myAtoi2(String s) {

		if (s == null || s.length() == 0)
			return 0;

		s = s.trim(); // Step 1: Remove leading whitespace
		if (s.length() == 0)
			return 0;

		int i = 0, sign = 1;
		long result = 0; // Use long to handle overflow safely

		// Step 2: Handle optional sign
		if (s.charAt(i) == '-') {
			sign = -1;
			i++;
		} else if (s.charAt(i) == '+') {
			i++;
		}

		// Step 3: Convert digits while checking overflow
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			result = result * 10 + (s.charAt(i) - '0');

			// If overflow occurs, return immediately
			if (result * sign > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if (result * sign < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}

			i++;
		}

		return (int) (result * sign);

	}

}
