import java.lang.*; 
  
class PalindromeTest { 
  
    public static void main(String args[]) 
    { 
        StringBuffer sbf = new StringBuffer("radar"); 
        System.out.println("String buffer  = " + sbf); 
  
        // Here it reverses the string buffer 
        String str=sbf.reverse().toString(); 
        System.out.println("String buffer after reversing = " + sbf); 
		
		if((sbf.toString().equals(str))==true)
			System.out.println(sbf);
		else
			System.out.println("not palindrome");
    } 
} 