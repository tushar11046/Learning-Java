package Assignment_02;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   demo d = new demo();
   new Thread() {
	   public void run() {
		   d.print1();
	   }
   }.start();
   new Thread() {
	   public void run() {
		   d.print1();
	   }
   }.start();
   new Thread() {
	   public void run() {
		   d.print1();
	   }
   }.start();
   
   new Thread() {
	   public void run() {
		   d.print();
	   }
   }.start();
   new Thread() {
	   public void run() {
		   d.print();
	   }
   }.start();
   new Thread() {
	   public void run() {
		   d.print();
	   }
   }.start();
   
   
	}

}

class demo extends Thread {
	
	
	synchronized void print1() {
		
		try {
			wait();
		}
		catch(Exception e) {
			
		}
		System.out.println("Pong");
	
		
		
	}
	
	synchronized void print() {
		
		System.out.println("Ping");
		notify();
		
	}
}