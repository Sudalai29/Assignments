package scratch;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamDemo {
	public static void main(String args[]) {
		
		//List<Integer> inte = Arrays.asList(1,2,3,4,5,6,7,8,9);
		//Stream<Integer> stream = inte.stream();
		//stream.filter(odd -> odd%2==0)
		//.forEach(val -> System.out.println(val));
		
		List<Integer> num = Arrays.asList(1,3,4,5,7,6);
		Stream<Integer> stream1 = num.stream();
		stream1.filter(val-> val%2==0).reduce((a,b)-> a+b).ifPresent(System.out::println);
		
	}

}
