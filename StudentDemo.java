package scratch;
import java.io.IOException;
import java.util.*;

class Student

{

   Scanner sc=new Scanner(System.in);

   int RegNo,Total=0,subjects;

   String name;

   int marks[] = new int[3];

   Student()

   {
     
      System.out.print("Enter Registration No.: ");

      RegNo=sc.nextInt();

      System.out.print("Enter Student Name: ");

      name=sc.next();;

      getDisMarks();

   }

   public void getDisMarks()

   {

       System.out.print("Enter marks of Physics: ");

       marks[0]=sc.nextInt();
       try {
		check(marks[0]);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

       System.out.print("Enter marks of Chemistry: ");

       marks[1]=sc.nextInt();
       try {
		check(marks[1]);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

       System.out.print("Enter marks of Maths: ");

       marks[2]=sc.nextInt();
       try {
		check(marks[2]);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

       for(int i=0;i<3;i++)

       {

          Total+=marks[i];

       }

       System.out.println("Total Marks of student "+name+": " +Total);

   }
   
   
   private void check(int c) throws IOException
   {
     if( (c < 0) || (c > 100) )
     {
       throw new IOException("enter no between 1 to 100");
     }
   }
}


class StudentDemo

{

    public static void main(String args[])

    {
        Student s[]=new Student[5];

        for(int i=0;i<5;i++)

              s[i]=new Student();

     }

}