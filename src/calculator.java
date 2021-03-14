import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
	char a ='A';
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = s.nextDouble();
		System.out.println("Enter the arithmetic operation");
		char operator = s.next().charAt(0);
		System.out.println("Enter the second number");
		double num2 = s.nextDouble();
		double result = 0.0;
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.println("Addition of " + num1 + " and " + num2 + " is "+ (int)result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("subtraction of " + num1 + " and " + num2 + " is "+ (int)result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Multiplication of " + num1 + " and " + num2 + " is "+ (int)result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("Division of " + num1 + " and " + num2 + " is "+ (int)result);
			break;
		case '%':
			result = num1 % num2;
			System.out.println("Modulous of " + num1 + " and " + num2 + " is "+ (int)result);
			break;
			
		default:
			System.out.println("Invalid operator");
			break;
		
		}
		

	}

}
