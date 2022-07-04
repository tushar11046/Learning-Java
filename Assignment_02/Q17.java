package Assignment_02;

public class Q17 {

	public static void main(String[] args) {

		SharedResource1 c = new SharedResource1();  //
		
		new Thread() {
			public void run() {
				c.withdraw(1500);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.withdraw(1500);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.withdraw(1500);
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				c.deposit(1000);
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(1000);
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(1000);
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(1000);
				
			}
		}.start();
		
		
		
	}
}
class SharedResource1 {
	int amount = 1000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
		
	}
}