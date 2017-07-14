
class GetPosNegChallenge {
	 

	public static void main(String args[]) {
		// TEST CASES
		//GetPosNegChallenge p = new GetPosNegChallenge();
		//Test Case 1
		boolean result;
		int a = 1;
		int b = -1;
		boolean bol = false;
		boolean expected = true;
		result = GetPosNegChallenge.getposNeg(a, b, bol);
		if (expected == result)
			System.out.println("PASS");
		else
			System.out.println("FAILS");
		//Test Case 2
		a = -1;
		b = 1;
		bol = false;
		expected = true;
		result = GetPosNegChallenge.getposNeg(a, b, bol);
		if (expected == result)
			System.out.println("PASS");
		else
			System.out.println("FAILS");

		// TEST CASE 3
		a = 1;
		b = 1;
		bol = false;
		expected = false;
		result = GetPosNegChallenge.getposNeg(a, b, bol);
		if (expected == result)
			System.out.println("PASS");
		else
			System.out.println("FAILS");

		// TEST CASE 4
		a = -1;
		b = -1;
		bol = false;
		expected = false;
		result = GetPosNegChallenge.getposNeg(a, b, bol);
		if (expected == result)
			System.out.println("PASS");
		else
			System.out.println("FAILS");

		// TEST CASE 5
		a = -1;
		b = -1;
		bol = true;
		expected = true;
		result = GetPosNegChallenge.getposNeg(a, b, bol);
		if (expected == result)
			System.out.println("PASS");
		else
			System.out.println("FAILS");

		// TEST CASE 6
		a = -1;
		b = 1;
		bol = true;
		expected = false;
		result = GetPosNegChallenge.getposNeg(a, b, bol);
		if (expected == result)
			System.out.println("PASS");
		else
			System.out.println("FAILS");

		// TEST CASE 7
		a = 1;
		b = 1;
		bol = true;
		expected = false;
		result = GetPosNegChallenge.getposNeg(a, b, bol);
		if (expected == result)
			System.out.println("PASS");
		else
			System.out.println("FAILS");

		// TEST CASE 8
		a = 1;
		b = -1;
		bol = true;
		expected = false;
		result = GetPosNegChallenge.getposNeg(a, b, bol);
		if (expected == result)
			System.out.println("PASS");
		else
			System.out.println("FAILS");
	}

	public static boolean getposNeg(int a, int b, boolean bol) {
		
		if (bol == false) {
			if ((a > 0 || b > 0) && (a < 0 || b < 0))
				return true;
			else
				return false;
		} else {
			if ((a > 0 || b > 0) && (a < 0 || b < 0))
				return false;
			else if (a > 0 && b > 0)
				return false;
			else
				return true;
		}
	}
}

