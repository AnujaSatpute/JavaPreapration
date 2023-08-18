package threadclass;
//Runnable interface
public class ThreadExample2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample2 obj = new ThreadExample2();
		Thread t1 = new Thread(obj);
		t1.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 2");
	}

}
