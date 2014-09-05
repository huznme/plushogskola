package ADassignment1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		String inputString = null;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to check if it is a palindrome");
		inputString = in.nextLine();
		
		while ( ! inputString.equals("exit")) {
			boolean palindrom = false;
			String inputStr = inputString.replaceAll("\\s+", "");
			inputStr = inputStr.toLowerCase();
			
			if (inputStr.contains(".")) {
				inputStr = inputStr.replace(".", "");

			}
			int length = inputStr.length();

			for (int i = 0; i < inputStr.length() / 2; i++) {
				if (inputStr.charAt(i) != inputStr.charAt(length - i - 1)) {
					palindrom = false;
					break;
				} else {
					palindrom = true;
				}

			}
			if (palindrom) {
				System.out
						.println("\""
								+ inputString
								+ "\"  is a palindrome. \nEnter a string to check if it is a palindrome");
				inputString = "";
				inputString = in.nextLine();
			}

		}

	}

}
