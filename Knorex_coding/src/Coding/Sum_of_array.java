package Coding;

public class Sum_of_array {

	public static void name(int array[], int num) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == num) {
					System.out.println("it is a sum of array" + array[i] + " +" + array[j] + " = " + num);
//					return true;
				}

			}
		}
//		return false;

	}

	public static void main(String[] args) {
		int array[] = new int[] { 1, -2, 1, 0, 5 };
		int sum = 3;

		name(array, sum);
	}

}
