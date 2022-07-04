package Assignment_02;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pingpong p = new pingpong();
		
		new Thread() {
			   public void run() {
				   for(int i=0;i<2;i++)
				   { p.print1();}
			   }
		   }.start();
		   new Thread() {
			   public void run() {
				   for(int i=0;i<2;i++)
				   { p.print1(); }
			   }
		   }.start();
		   new Thread() {
			   public void run() {
				   for(int i=0;i<2;i++)
				   { p.print1(); }
			   }
		   }.start();
		   
		   new Thread() {
			   public void run() {
				   for(int i=0;i<2;i++)
				   { p.print();  }
			   }
		   }.start();
		   new Thread() {
			   public void run() {
				   for(int i=0;i<2;i++)
				   { p.print(); }
			   }
		   }.start();
		   new Thread() {
			   public void run() {
				   for(int i=0;i<2;i++)
				   { p.print();  }
			   }
		   }.start();

}
}
class pingpong extends Thread {
	
    synchronized void print1() {
	try
	{
		wait();
	}
	catch(Exception e) {
		
	}
	System.out.println("pong");
	
}

   synchronized void print() {
	System.out.println("ping");
	notify();
}
}