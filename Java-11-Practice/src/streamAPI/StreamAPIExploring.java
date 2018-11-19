package streamAPI;

import java.util.stream.IntStream;

public class StreamAPIExploring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		streamsWillExeOnce();
		uselimitToAvoidInifiniteStream();
		
	}
	
	//1. only once execute
	public static void streamsWillExeOnce() {
		IntStream stream = IntStream.of(1, 2);
		stream.forEach(System.out::println);
		 
		// That was fun! Let's do it again!
		//stream.forEach(System.out::println); // IllegalStateException
		
	}
	
	// 2. avoid inifiniate loops
	public static void inifiniteStream() {

		// Will run indefinitely
		IntStream.iterate(2, i -> i + 1)
		         .forEach(System.out::println);
		
	}
	
	//3. use limit to avoid inifinite stream
	public static void uselimitToAvoidInifiniteStream() {

		// Will run indefinitely
		IntStream.iterate(0, i -> i + 1).limit(9)
		         .forEach(System.out::println);
		
		
		// no need distinct here
		IntStream.iterate(0, i -> ( i + 1 ) % 2)
        .distinct()
        .limit(10)
        .forEach(System.out::println);
		
		// no need parallel and distinct here
		IntStream.iterate(0, i -> ( i + 1 ) % 2)
        .parallel()
        .distinct()
        .limit(10)
        .forEach(System.out::println);
		
	}
	
	

}
