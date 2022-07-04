package Assignment_02;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String s = sc.nextLine();
		
		rev R = new rev();
		R.reverse(s);
		
		

	}

}
class rev {
	
	void reverse(String s) {
		
		String t =" ";
		for(int i=s.length();i>0;i--) {
			t=t+(s.charAt(i-1));
			
		}
		
		System.out.println("Reversed string is = " +t);
	}
}