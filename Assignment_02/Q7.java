package Assignment_02;

import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String info = "hello";
	        
	        char str[] = info.toCharArray();  
	         
	        int len = str.length;   
	        //Calling removeDuplicates() method to remove duplicate characters  
	        
	       count1 cn = new count1();
	       cn.removeDuplicate(str, len);

	}

	

}


class count1
{
      void removeDuplicate(char str[], int n)
    {
       
        int index = 0;

        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
        
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        System.out.println( String.valueOf(Arrays.copyOf(str, index)));
    }
}
