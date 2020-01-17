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
		for (int i = 0; i < n; i++) {
			firstLast[i] = values[i];
		}

		for (int i = n; i > 0; i--) {
			firstLast[i] = values[values.length-n];
		}

		return firstLast;	// default return value to ensure compilation
	}

	public int difference(int[] numbers) {
		int max;
		int min;

		if (numbers == null || numbers.length < 1) {
			return max;
		}

		//Finding the min and max (thanks @gitbook)
    for (int number : numbers) {
        if (number > max) {
          max = number;
        } else if (number < min){
					min = number;
				}
    }

		return (max/min);		// default return value to ensure compilation
	}

	public double biggest(double[] numbers) {
		//Check things
		if (numbers == null || numbers.length < 3 || (numbers.length/2) == 0 || ) {
			return -1;
		}
		//Check for negatives
		for (double number : numbers) {
			if (number < 0){
				return -1;
			}
		}

		double first = numbers[1];
		double middle = numbers[(numbers.length+1)/2];
		double last = numbers[numbers.length-1];

		if (first>middle&&first>last) {
			max = first;
		} else if (middle>last){
			max = middle;
		} else {
			max last;
		}

		return max;
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
