/**
 * 
 */
package toby;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2;
		double result;
		char oper;
		
		System.out.println("Enter first number");
		num1 = scanner.nextDouble();
		
		System.out.println("Enter second number");
		num2 = scanner.nextDouble();
		
		System.out.println("Enter operator");
		oper = scanner.next().charAt(0);
		
		result = calculate(oper, num1, num2);
        System.out.println("The answer is " + result);
        
        scanner.close();
	}
		
		public static double calculate(char oper, double num1, double num2) {
			double result = 0;
			switch (oper) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case 'x':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				throw new IllegalArgumentException("Invalid operator: " + oper);
			}
			return result;
		}
		
	}


