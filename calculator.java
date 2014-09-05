package plushogskola;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length > 3 || args.length < 3) {
			System.out.println("Invalid Input...!");
			System.exit(0);
		}

		int variableOne, variableTwo, result = 0;
		variableOne = Integer.valueOf(args[0]);
		variableTwo = Integer.valueOf(args[2]);
		String opr = args[1];
		switch (opr) {
		case "+":
			result = variableOne + variableTwo;
			break;
		case "-":
			result = variableOne - variableTwo;
			break;
		case "*":
			result = variableOne * variableTwo;
			break;
		case "/":
			result = variableOne / variableTwo;
			break;
		case "%":
			result = variableOne / variableTwo;
			break;

		default:
			System.out.println("Invalid Input");

		}
		System.out.println("Resukt is :" + result);

	}

}
