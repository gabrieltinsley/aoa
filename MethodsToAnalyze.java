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
		 * Breaking down the for loop into intializing i and then the if statement
		 * checks i is greater than the array length before exiting the loop we clearly
		 * see the equation.
		 */

		 // t(0) = 2

		 // t(n) = 2 + n(3) = 3n + 2

		int i = 0; // 1
		if(i < array.length) { // 1
			if(array[i] == value){ // 1
				return i; // n(3)
			}
			i++; // 1
		}
		// for (int i = 0; i < array.length; i++) {
		// 	if (array[i] == value) {
		// 		return i;
		// 	}
		// }
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

		 // t(0) = 4
		 // t(n) = 4 + n(3 + 1 + n(3/2)) + 3(3n/2) = (3/2)n^2 + (15/2)n + 4

		int index = find(array, oldValue);
		// This looks like
		 // t worst(n) = 3n + 2 before returning -1
		 // t avg(n) = (3/2)n + 2 before returning i

		while (index > -1) { // 1
			array[index] = newValue; // 1
		 	index = find(array, oldValue); // (3/2)n + 2
		}
	}
	
	/**
	 * Take an int[] and reorganize it so they are in ascending order.
	 * @param array ints that need to be ordered 
	 */
	public static void sortIt(int[] array) {

	/*
	 * The int next is intialized to 1, then next is checked if less
	 * than array length. If n == 0 or n == 1 than the second statement
	 * returns false. That means there are two statements that happen no
	 * matter what.
	 */

	 // t(0 or 1) = 2

	int next = 1; // 1 
	if(next < array.length) { // n(5) + 2 = n(n/2) + 5n + 2 = n^2/2 +5n + 2
		int value = array[next]; // 1
		int index = next; // 1 
		while (index > 0 && value < array[index - 1]) { // 2n + 2 // n/2 + 2
			array[index] = array[index - 1]; // 1
			index--; // 1
		}
		array[index] = value; // 1
		next++; // 1
	}
	// for (int next = 1; next < array.length; next++) {
	// 		int value = array[next];
	// 		int index = next;
	 		//while (index > 0 && value < array[index - 1]) {
	// 			array[index] = array[index - 1];
	// 			index--;
	// 		}
	// 		array[index] = value;
	// 	}
	}
}
