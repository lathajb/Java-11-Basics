package Exceptions;

public class NestedTryBlocks {
	
	public static void main(String[] args) {
		
		//nestedTryBlockWithOutCatch();
		nestedTryBlockWithCatch();
			
	}
	
	
	public static void nestedTryBlockWithOutCatch() {
		try {
			  try {
			    throw new Error("oops");
			  }
			  finally {
			   
			    System.out.println("finally");
			  }
			}catch (Exception ex) {
				
				//System.out.println(ex.getMessage());
				System.out.println("error"); 
			  
			}
	}
	
	public static void nestedTryBlockWithCatch() {
		try {
			  try {
			    throw new Error("oops");
			  }
			  catch (Exception ex) {System.out.println("Iner catch");
				  System.out.println(ex.getMessage()+"Inner catch");
				  throw ex;
			  }
			  finally {
				  System.out.println("Inner finally");
			  }
			}
			catch (Exception ex) {
				 System.out.println("outer catch");
				 System.out.println(ex.getMessage()+"Outer catch");
			}
	}
	
	

}
