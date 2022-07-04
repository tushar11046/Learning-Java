package Assignment_02;



public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	Count obj = new Count();
		System.out.println(Thread.currentThread().getName());   //tell the name of the thread

		Thread threadOne = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {

					obj.webcount();

				}
			}
		});

		Thread threadTwo = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {

					obj.webcount();

				}
			}
		});
		
		Thread threadThree = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {

					obj.webcount();

				}
			}
		});
		
		Thread threadfour = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {

					obj.webcount();

				}
			}
		});
		
		Thread threadfive = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {

					obj.webcount();

				}
			}
		});

		threadOne.start();
		threadTwo.start();
		threadThree.start();
		threadfour.start();
		threadfive.start();

		//Waits for this thread to die. {Main thread will wait until this thread is finished}
		threadOne.join();   //it is important to join the thread
		
		//Waits for this thread to die. {Main thread will wait until this thread is finished}
		threadTwo.join();
		threadThree.join();
		threadfour.join();
		threadfive.join();

		System.out.println("Count: " +Count.t1);


	}

}

class Count {

	public static int t1 = 0;

	//You want T1 to complete first and then T2 
	//uses separate memory stack for performing operation,that's why JVM is a virtual
	
	public synchronized void webcount() {  //lock mechanism,at one time only one thread works
		
		//If not synchronized then, T1 and T2 may read the same value of count at 
		//the same time and may increment same time as well
		t1+=5;
	}
}