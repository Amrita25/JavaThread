package synchronization;

public class Display {

	public static synchronized void wish(String name){

		for(int i=0;i<5;i++){
			System.out.println("Good Morning "+name);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
