package deadlock;

public class DeadLockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeadDemo dead = new DeadDemo();
		DeadLockThread1 t1 = new DeadLockThread1(dead);

		DeadLockThread2 t2 = new DeadLockThread2(dead);
		t1.start();
		t2.start();
	}

}
