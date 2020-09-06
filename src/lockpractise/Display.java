package lockpractise;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	
	ReentrantLock l = new ReentrantLock();
	
	

	public  void wish(String name){
		l.lock();
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++){
			System.out.println("Good Morning "+name);
			wishluck(name);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		l.unlock();
	}
	
	public void wishluck(String name){
		l.lock();
		
		System.out.println(l.isLocked());
		
		System.out.println("Good Luck "+name);
		
		l.unlock();
		//l.unlock();
		
	}

}
