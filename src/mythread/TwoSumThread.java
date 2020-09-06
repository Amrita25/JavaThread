package mythread;

public class TwoSumThread extends Thread{
	
	private TwoSum twosum;
	
	@Override
	public void run(){
		
			for(int i=0;i<5;i++){
				twosum.add(i);
				
		}
		
		
	}

	public TwoSum getTwosum() {
		return twosum;
	}

	public void setTwosum(TwoSum twosum) {
		this.twosum = twosum;
	}

}
