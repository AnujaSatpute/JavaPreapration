package threadclass;
//Thread class
public class ExampleOFThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleOFThread obj = new ExampleOFThread();
		obj.setName("first");
		
		ExampleOFThread obj1 = new ExampleOFThread();
		obj1.setName("second");
		obj.start();
		obj1.start();
	}

}
