package synchronization;

public class SynchronisedDemo {
	
	
	private static void scenario2(){
		
		Display d1 = new Display();
		Display d2 = new Display();

		MyThread t1 = new MyThread(d1, "Biltu");
		MyThread t2 = new MyThread(d2, "Puchi");

		t1.start();

		t2.start();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Display display = new Display();

		MyThread t1 = new MyThread(display, "Biltu");
		MyThread t2 = new MyThread(display, "Puchi");

		t1.start();

		t2.start();*/
		
		scenario2();
		
		///////////////////////////////////////////////////
		
		
	}

}
