package Exceptions;

public class ExceptionExploreWithReturn {

	public static void main(String[] args) {
		//System.out.println(testExceptionReturn());
		//System.out.println(artimaticException());
		//System.out.println(returnIncatchAndEOM());
		//System.out.println(withoutcatchblock());
		//System.out.println(returnIntryAndEOM());
		//System.out.println(returnIntryAndCatch());
		//System.out.println(returnInFinallyOnly());
		System.out.println(eoMreturn());
		
	}
	
	public static int testExceptionReturn() {
		 		try{
		        int c=10;
		        return c;
		        } catch(Exception e){
		             return 0;
		        } finally{
		            return 3;
		        }
	}
	
	// if catch or try only have return statement compilation error
	public static int artimaticException() {
		System.out.println("starting of the method");
		int result = 0;
		try {
			result = 18/0;
			return result;
		}catch(ArithmeticException ae) {
			System.out.println("Exception :"+ae.getMessage());
			//return 9;
		}finally{
			System.out.println("from finally :" + result);
			return result;
		}
		
		
		//System.out.println("End of the method"); // unreachable code
		
	}
	
	// in catch and EOM -- no error
	public static int returnIncatchAndEOM() {
		
		int result = 0;
		try {
			result = 18/0;
		}catch(ArithmeticException ae) {
			System.out.println("Exception :"+ae.getMessage());
			return 9;
		}finally{
			System.out.println("from finally :" + result);
		}
		
		return result;
	}
	
	public static int withoutcatchblock() {
		
		int result = 0;
		try {
			result = 18/0;
			return result;
		}finally{
			System.out.println("from finally :" + result);
			return result;
		}
		
		
	}
	
	//try and EOM - no error ---- if it is in try catch and EOM  error
	public static int returnIntryAndEOM() {
		
		int result = 0;
		try {
			result = 18/0;
			return result;
		}catch(ArithmeticException ae) {
			System.out.println("Exception :"+ae.getMessage());
			//return 9;
		}finally{
			System.out.println("from finally :" + result);
		}
		return result; 
		
		
	}
	
	//try and catch --> no error 
	public static int returnIntryAndCatch() {
		
		int result = 0;
		try {
			result = 18/0;
			return result;
		}catch(ArithmeticException ae) {
			System.out.println("Exception :"+ae.getMessage());
			return 9;
		}finally{
			System.out.println("from finally :" + result);
		}
		
		
	}
	

  //only for finally --> no error
  public static int returnInFinallyOnly() {
		
		int result = 0;
		try {
			result = 18/0;
			
		}catch(ArithmeticException ae) {
			System.out.println("Exception :"+ae.getMessage());
			
		}finally{
			System.out.println("from finally :" + result);
			return 9;
		}
	}
  
  
  public static int eoMreturn() {
		
		int result = 0;
		try {
			result = 18/0;
			
		}catch(ArithmeticException ae) {
			System.out.println("Exception :"+ae.getMessage());
			
		}finally{
			System.out.println("from finally :" + result);
		}
		return result;
	}

}
