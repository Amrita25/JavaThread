package lockpractise;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReentrantLock l = new ReentrantLock();
		
		l.lock();
		l.lock();
		
		System.out.println(l.isLocked());
		System.out.println(l.getHoldCount());
		
		l.lock();
		System.out.println(l.getHoldCount());
		
		l.unlock();
		System.out.println(l.getHoldCount());
		
		l.unlock();
		System.out.println(l.getHoldCount());
		
		l.unlock();
		System.out.println(l.isLocked());
		System.out.println(l.getHoldCount());

	}

}
