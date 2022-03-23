package scratch;

public class Box {
	
	double width;
    double height; 
	double depth;
		
		  Box(double w, double h, double d) {
			    width = w;
			    height = h;
			    depth = d;
			  }
	
	 

	public double volume() {
		// TODO Auto-generated method stub
		return width * height * depth;
	}


}