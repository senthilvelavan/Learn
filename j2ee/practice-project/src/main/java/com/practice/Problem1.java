package main.java.com.practice;

public class Problem1 {

	public static Integer[] shuffleTiles(Integer[] integerArrays) throws Exception {

		for (int i = 0; i < integerArrays.length; i++) {
			for (int j = 0; j < integerArrays.length; j++) {
				if ((i == (j + 1)) || (j == (i + 1))) {
					if (isPrime(integerArrays[i] + integerArrays[j]) && integerArrays[i] < integerArrays[j]) {
						System.out.println(integerArrays[i]+"-"+integerArrays[j]+"sum "+ (integerArrays[i] + integerArrays[j])+" is a prime number");
						Integer k = new Integer(0);
						k = integerArrays[i];
						integerArrays[i] = integerArrays[j];
						integerArrays[j] = k;
						System.out.println("after the swap");
					}

				}
				System.out.println("after iteration j" + j);
				for (Integer value : integerArrays) {
					System.out.println(value);
				}
			}
			System.out.println("after iteration i " + i);
			for (Integer value : integerArrays) {
				System.out.println(value);
			}

		}

		return integerArrays;
	}

	private static boolean isPrime(int isPrime) {
		boolean isPrimeNumber = true;
		for (int i = isPrime-1; i > 1; i--) {
			if (isPrime % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		return isPrimeNumber;
	}

	public static void main(String args[]) throws Exception {
		Integer[] testArray = new Integer[9];
		testArray = new Integer[] { 7, 3, 2, 4, 1, 5, 6, 8, 9 };
		testArray = shuffleTiles(testArray);
		for (Integer value : testArray) {
			System.out.println(value);
		}
	}

}
