package deadlock;

public class DeadDemo {


	public void method1(){
		synchronized (Integer.class) {

			System.out.println("acquired lock on Integer.class object  "+Thread.currentThread().getName());
			System.out.println("trying to get  lock on string.class object  "+Thread.currentThread().getName());

			synchronized (String.class) {
				System.out.println("acquired lock on String.class object  "+Thread.currentThread().getName());
			}

		}
	}

	public void method2(){
		


		synchronized (String.class) {

			System.out.println("acquired lock on String.class object  "+Thread.currentThread().getName());
			System.out.println("trying to get lock on integer class object  "+Thread.currentThread().getName());

			synchronized (Integer.class) {
				System.out.println("acquired lock on Integer.class object  "+Thread.currentThread().getName());
			}


		}

	}

}
