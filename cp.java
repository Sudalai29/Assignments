package scratch;
import java.util.Scanner;
public class cp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Guess the lucky number :");
			int ln = sc.nextInt();
			int min=1;
			int max=10;
			int luckyNumber = ((int)(Math.random()*max))+min;
			int i=0;
			while(i<10) {
				if(luckyNumber==ln) {
					i+=1;
					System.out.println("Correct guess");
					System.out.println("no.of.attempts "+(i));
					break;
				}else {
					i+=1;
					System.out.println("wrong guess no.of.attempts "+(i));
					System.out.println("Guess the lucky no:");
					ln= sc.nextInt();
					
				}
			}
		}
	
		
	}	
	}
