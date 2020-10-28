package multithreading;

// multithreading using runnable interface

class ThankYou implements Runnable {
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thank You");
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}

class Welcome implements Runnable {
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Welcome");
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}


public class MultithreadDemo_II {
	
	public static void main( String[] args) {
		
		Runnable obj = new Hi();
		Runnable obj2 = new Hello();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		t2.start();
	
	}

}

