package overloading;

public class CompiletimePolimorphism {

	public static void main(String[] args) {
		
	
	}
	
	 // Overloaded method
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }
 
    // Overloading method
    public Integer sum(Float a, Integer b) {  //Valid
        return null;
    }
    
    
    // Overloading method
    public Integer sum( Integer b, Float a) {  //Valid
        return null;
    }
    
    
    // Compile time error while overloading with exception
//    public Integer sum(Integer a, Integer b) throws NullPointerException{
//        return a + b;
//    }
 
    
    // Compile time error while changing the return type
//    public Float sum(Integer a, Integer b) {     //Not valid; Compile time error
//        return null;
//    }
  
}
