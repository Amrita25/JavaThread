package deadlock;

public class DeadLockThread1 extends Thread{
	
	private DeadDemo deadDemo;
	
	@Override
	public void run(){
		
		deadDemo.method1();
		
	}

	public DeadLockThread1(DeadDemo deadDemo) {
		super();
		this.deadDemo = deadDemo;
	}
	
	

}
