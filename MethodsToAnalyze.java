/**
 * A collection of methods that work with arrays of ints.
 * 
 * @author mvail
 */
public class MethodsToAnalyze {
	/**
	 * Return index where value is found in array or -1 if not found.
	 * @param array ints where value may be found
	 * @param value int that may be in array
	 * @return index where value is found or -1 if not found
	 */
	public static int find(int[] array, int value) {
		/*
		 * for-loop intializes i and checks if that is less than array length
		 * which returns false, so 2 statements happen no matter what
		 */

		 // t(n) = 2 + n(3) = 3n + 2
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Replace all occurrences of oldValue with newValue in array.
	 * @param array ints where oldValue may be found
	 * @param oldValue value to replace
	 * @param newValue new value
	 */
	public static void replaceAll(int[] array, int oldValue, int newValue) {
		/*
		 * The int index is intialized then jumps into the find for loop, since n == 0, then 
		 * the for-loop for find intializes i and checks if that is less than array length
		 * which would be false and -1 is returned so the while loop is checked which would be false, 
		 * so 4 statements happen no matter what
		 */

		 // t(n) = 4 + n(3 + 1 + n(3/2)) + 3(3n/2) = (3/2)n^2 + (15/2)n + 4
		int index = find(array, oldValue);
		while (index > -1) {
			array[index] = newValue;
			index = find(array, oldValue);
		}
	}
	
	/**
	 * Take an int[] and reorganize it so they are in ascending order.
	 * @param array ints that need to be ordered 
	 */
	public static void sortIt(int[] array) {
		for (int next = 1; next < array.length; next++) {
			int value = array[next];
			int index = next;
			while (index > 0 && value < array[index - 1]) {
				array[index] = array[index - 1];
				index--;
			}
			array[index] = value;
		}
	}
}
