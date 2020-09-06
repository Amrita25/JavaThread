package deadlock;

public class DeadLockThread2 extends Thread{
	
private DeadDemo deadDemo;
	
	@Override
	public void run(){
		
		deadDemo.method2();
		
	}

	public DeadLockThread2(DeadDemo deadDemo) {
		super();
		this.deadDemo = deadDemo;
	}

}
