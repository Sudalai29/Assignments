package scratch;

import java.util.Scanner;

public class trycatch {
    public static void main(String [] args) {
		Scanner keyBoardInput = new  Scanner(System.in);
    	System.out.print("Enter a no: " );
    	try{
    	double num = keyBoardInput.nextDouble();
    	System.out.println(num);
    }catch (Exception m){
    	System.out.println(m);
    	boolean bool = true;
    	if(bool = false) {
    	 System.out.println("a");
    	} else if (bool) {
    	 System.out.println("b");
    	} else if (!bool) {
    	 System.out.println("c");
    	} else {
    	 System.out.println("d");
    	}
    }
    }
    
    
}
