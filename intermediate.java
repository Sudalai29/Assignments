package scratch;
public class intermediate {
	public static void main(String [] args) {
		System.out.println(pow(3,2));
	}
		
		public static int pow(int baseNum, int powNum) {
			int result = 1;
			for (int i = 0; i < powNum; i++) {
				result = result*baseNum;
		}
		return result; 
		
	}
}

	
