package Assignment_02;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "avajava", str2 = "javaava";  
        
        if(str1.length() != str2.length()){  
            System.out.println("YES");  
        }  
        else {  
         
            str1 = str1.concat(str1);  
              
            
            if(str1.indexOf(str2) != -1)  
                System.out.println("NO");  
            else  
                System.out.println("Second string is not a rotation of first string");  
        }  

	}

}
