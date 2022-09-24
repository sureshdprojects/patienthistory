import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		Integer[] arr =  {1,2,12,123,1234};
		List<Integer> l = Arrays.asList(arr);
		l.stream().map(n->n+"")
					.filter(n->n.startsWith("1"))
					.forEach(System.out::println);

		//hello
		
				

	}

}
