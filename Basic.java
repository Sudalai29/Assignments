package scratch;

import java.util.Scanner;

public class Basic {
	public static void main(String [] args ) {
		
	try (Scanner keyBoardInput = new Scanner (System.in)) {
		System.out.print("enter the first no: ");
		   int num1 = keyBoardInput.nextInt();
		   System.out.print("enter the operator: ");
		   String op = keyBoardInput.next();
		   System.out.print("enter the second no: ");
		   int num2 = keyBoardInput.nextInt();
		   
		   if(op.equals("+")) {
			   System.out.println("the sum is " + (num1 + num2)); 
			   
		   }else if (op.equals("-")) {
			   System.out.println("the Difference is " + (num1 - num2));
			   
		   }else if(op.equals("*")) {
			   System.out.println("the multiplication is " + (num1 * num2));
			   
		   }else if(op.equals("/")) {
			   System.out.println("the Quotient is " + (num1/num2));
			   
		   }else
			   System.out.println("invalid operator or invalid form of number");
	}
	   
	}
	}
	