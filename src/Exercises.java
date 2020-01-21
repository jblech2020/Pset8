public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		if ((a[a.length-1] == b[b.length-1]) || (a[0] == b[0])){
			return true;
		}

		return  false;	// default return value to ensure compilation
	}

	public String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n < 0) {
			return null;
		}

		String[] firstLast = new String[n*2];
		for (int i = 0; i < values.length; i++) {
			firstLast[i] = values[i];
		}

		firstLast[0] = values[0];
		firstLast[1] = values[values.length-1];

		return firstLast;	// default return value to ensure compilation
	}

	public int difference(int[] numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public double biggest(double[] numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public String[] middle(String[] values) {
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(int[] numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(String[] values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}