package scratch;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
	public static void main(String[] args) {


		try {
		FileOutputStream text=new FileOutputStream("C:\\Users\\SudalaiMadan\\Desktop\\test.txt");

		        if(text != null) {
		 System.out.println("file is created successfully");
		 } else
		
		text.write(65);
		text.write(68);

		String s= "Hai";
		byte b[]=s.getBytes();
		text.write(b);
		System.out.println(text.toString());
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}    

		}
}
