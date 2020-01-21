public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		//Check
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		if ((a[a.length-1] == b[b.length-1]) || (a[0] == b[0])){
			return true;
		}

		return  false;	// default return value to ensure compilation
	}

	public String[] endsMeet(String[] values, int n) {
		//Check
		String empty[] = new String[0];
		if (values == null || values.length < n || n <= 0) {
			return empty;
		}

		String firstLast[] = new String[n*2];
		for (int i = 0; i < n; i++) {
			firstLast[i] = values[i];
		}

		int placeHolder = n;
		for (int i = n; i < 2*n; i++) {
			firstLast[i] = values[values.length-placeHolder];
			placeHolder--;
		}

		return firstLast;	// default return value to ensure compilation
	}

	public int difference(int[] numbers) {
		//Check
		if (numbers == null || numbers.length < 1) {
			return -1;
		}

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		int difference = largest - smallest;
		return difference;
	}

	public double biggest(double[] numbers) {
		//Check
		if (numbers == null || numbers.length < 3 || numbers.length%2 == 0) {
			return -1;
		}

		int midIndex = (int)(Math.ceil(numbers.length / 2));
		double max = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				return -1;
		}
			if ((i == 0 || i == numbers.length - 1 || i == midIndex) && numbers[i] > max) {
				max = numbers[i];
			}
		   }
		return max;
	}

	public String[] middle(String[] values) {
		//Check
		String empty[] = new String[0];
		if (values == null || values.length < 3 || (values.length % 2) == 0) {
			return empty;
		}

		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				return empty;
			}
		}

		int middle = values.length / 2;
		int first = middle - 1;
		int last = middle + 1;

		String[] result = {values[first], values[middle], values[last]};
		return result;
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
