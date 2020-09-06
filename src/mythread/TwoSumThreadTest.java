package mythread;



public class TwoSumThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum twosm = new TwoSum();
		TwoSumThread t1 = new TwoSumThread();
		t1.setTwosum(twosm);
		
		
		
		TwoSumThread t2 = new TwoSumThread();
		t2.setTwosum(twosm);
		
		
		t1.start();
		t2.start();

	}

}
