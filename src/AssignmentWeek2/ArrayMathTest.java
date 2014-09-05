package AssignmentWeek2;

import java.util.Random;

public class ArrayMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[50];
		Random rand = new Random();
		// initialization

		for (int x = 0; x < 50; x++) {
			array[x] = rand.nextInt(200) + 1;
		}

		System.out.println("Original Array  is :");
		// Print
		for (int x = 0; x < 50; x++) {
			System.out.print(array[x] + ":");
		}
		System.out.println();

		// Maximum

		System.out.println("Maximum Value is :" + findMax(array));

		System.out.println("Minimum Value is :" + findMin(array));

		System.out.println("Average Value is :" + findAvg(array));

		System.out.println("Standard Daviation  is :"
				+ findStandardDeviation(array));

	}

	public static int findMax(int[] array) {
		int max = 0;
		for (int x = 0; x < array.length; x++) {
			if (array[x] > max) {
				max = array[x];
			}

		}

		return max;

	}

	public static int findMin(int[] array) {
		int min = 200;
		for (int x = 0; x < array.length; x++) {
			if (array[x] < min) {
				min = array[x];
			}
			}

		return min;

	}

	public static int findAvg(int[] array) {
		int sum = 0;
		for (int x = 0; x < array.length; x++) {
			sum = array[x] + sum;

		}

		return sum / array.length;

	}

	public static double findStandardDeviation(int[] array) {
		double variance = 0;
		int avg = findAvg(array);
		for (int i = 0; i < array.length; i++) {
			variance = variance + Math.pow(array[i] - avg, 2);
		}
		variance = variance / (array.length );

		double standardDeviation = Math.sqrt(variance );

		return standardDeviation;
	}

}
