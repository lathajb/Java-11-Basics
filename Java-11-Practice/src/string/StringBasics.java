package string;

public class StringBasics {

	public static void main(String[] args) {
		
		isStringKeyWord();
		System.out.println("======================================================");
		System.out.println(internUsage());
		System.out.println("======================================================");
		diffEqualsandOperator();
		

	}
	
	public static void isStringKeyWord() {
		String String = "one";
		System.out.println(String);
	}
	
	public static boolean internUsage() {
		String one = "two";
		String two = new String("two");
		return one.intern() == two.intern();
	}
	
	
	public static boolean diffEqualsandOperator() {
		String one = "two";
		String three = "two";
		
		
		String two = new String("two");
		String four = new String("two");
		
		if(one == two)
			System.out.println(" one == two Checks Object reference :" +one);
		
		if(one == three)
			System.out.println(" one == two Checks Object reference using string literals:" +one);
		
		if(one == four)
			System.out.println(" one == two Checks Object reference using string new:" +one);
		
		
		
		if(one.equals(two)) {
			System.out.println(" one.equals(two) Checks Object value :"+one);
		}
		return one.intern() == two.intern();
	}

}
