package scratch;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filereadwrite {
		@SuppressWarnings("resource")
		public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the message");
		String s =  sc.nextLine();
		String s1= s.toUpperCase();

		try {
		
		BufferedWriter fw = new BufferedWriter(new FileWriter("ReadWrite.txt"));

		fw.write(s1);
		fw.close();
		
		BufferedReader br= new BufferedReader(new FileReader("ReadWrite.txt"));
		System.out.println("Contents of file");
		br.lines().forEach(System.out::print);  
		br.close();
		} catch (IOException e) {
		
		e.printStackTrace();
		}


		}

	}



