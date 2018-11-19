package string;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char [] charArray = {'a','b','c','d','e','f'};
			char [] palindrom = {'a','b','a'};
			StringBuilder res = usingfor(charArray);
			String result = usingString(charArray);
			System.out.println("using stringbuilder append and for loop :"+res.equals(new String(charArray)));
			System.out.println("Using string += "+res.equals(result));
			withOutreverse(palindrom);
			
			System.out.println(stringWordReverse());
			
	}
	
	
	public static StringBuilder usingfor(char [] stringArry) {
		StringBuilder a = new StringBuilder();
		for(int i = (stringArry.length-1) ;i >= 0 ;i--) {
			System.out.println(stringArry[i]);
			a.append(stringArry[i]);
			System.out.println(a);	
		}
		
		return a;
	}
	
	
	public static String usingString(char [] stringArry) {
		
		String result = new String();
		for(int i = (stringArry.length-1) ;i >= 0 ;i--) {
			result += stringArry[i];
		}
		return result;
	}
	
	public static void withOutreverse(char[] strignArray) {
		String tst = new String(strignArray);
		int start =0;
		int end = tst.length() -1;
		int middle = (start + end)/2; 
		
		for(int i = start ;i <=  middle ;i++) {
				
			if(tst.charAt(i) == tst.charAt(end) ) {
				start++;
				end--;
			}else {
				break;
			}
			
		}
		
		if(start == middle+1) {
			System.out.println("Panlindrom");
		}
	}
	
	
	public static StringBuilder stringWordReverse() {
		String blogName = "how to do in java dot com";
		
		String[] words = blogName.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(String word : words) {
			StringBuilder reversed = new StringBuilder(word).reverse();
			sb.append(reversed+" ");
		}
		return sb;
	}

}
