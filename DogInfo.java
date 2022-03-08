package scratch;

public class DogInfo {

	public static void main(String[] args) {
		Dog info = new Dog();
		
		info.name = "blue";
		info.breed= "doberman";
		info.age=2;
		info.color="black";
		info.vaccineDoses=4;
		
		System.out.println(info.getInfo() );  //info.getInfo2()//);
		
		

	}

}
