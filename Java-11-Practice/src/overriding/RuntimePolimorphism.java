package overriding;

import java.io.FileNotFoundException;

public class RuntimePolimorphism extends SuperClass{
	
	public static void main(String[] args) throws Exception {
		  SuperClass rp = new RuntimePolimorphism();
		  System.out.println(rp.sum(1,6));
		  //System.out.println(rp.sum1(4, 4)); compile time error becuare parent class method is private
		  rp.hello();
		  
		  RuntimePolimorphism rpc = new RuntimePolimorphism();
		  System.out.println(rpc.sum1(4, 4));
	}
	
	//Overriding method
    @Override
    public Integer sum(Integer a, Integer b)  throws FileNotFoundException{      //Integer extends Number; so it's valid
        return a + b;
    }
    
    public RuntimePolimorphism() {
		// TODO Auto-generated constructor stub
	} 
    
    public Integer sum1(Integer a, Integer b) {  
        return a + b;
    }
    
    public static void hello() {
    	System.out.println("i am from child");
    }
    
  
    
}



class SuperClass {
    //Overriden method
    protected Number sum(Integer a, Integer b)throws Exception {
        return a + b;
    }
    
    private Integer sum1(Integer a, Integer b) {   //private method; overriding not possible
        return a - b;
    }
    
    public static void hello() {
    	System.out.println("i am from parent");
    }
    
}
 

