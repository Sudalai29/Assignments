package scratch ;

import java.util.Scanner;

public class method {
	 public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number : ");
		double num1 = sc.nextDouble();
		System.out.println("enter the operator :");
		String op = sc.next();
		System.out.println("enter the second no :");
		double num2 = sc.nextDouble();
		
		if(op.equals("+")) {
			System.out.println("the sum of the two numbers is: " + (num1 + num2));
			
		}else if(op.equals("-")) {
			System.out.println("the difference of two numbers is :"+(num1 - num2));
			
		}else if (op.equals("*")) {
			System.out.println("the multiplication of the two numbers is: " + (num1 * num2));
		}else if (op.equals ("/")) {
			System.out.println("the division of the two numbers is: " +(num1/num2));
		}else 
			System.out.println("invalid operator");
}
}	