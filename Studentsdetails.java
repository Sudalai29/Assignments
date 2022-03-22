package scratch;

public class Studentsdetails {
	private int student_rollno;
	  private String student_name;
	  private int student_std;
	  private char student_section;
	  
	  public  Studentsdetails(int student_rollno,String student_name,int student_std, char student_section){
	    this.student_rollno = student_rollno;
	    this.student_name = student_name;
	    this.student_std = student_std;
	    this.student_section = student_section;  
	  }
	  
	  public boolean isEqual(Studentsdetails student_2){
	    return (this.student_rollno == student_2.student_rollno && this.student_section == student_2.student_section && this.student_std == student_2.student_std && this.student_name == student_2.student_name);
	  }
	  
}
