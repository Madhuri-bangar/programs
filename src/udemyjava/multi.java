package udemyjava;

public class multi extends Thread{
	// use of threads in Java
	@Override
	public void run() { //c sheduler
		//System.out.println("this is run method-cs");
	for(int i=1;i<=5;i++)
		System.out.println(i);
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());//5
	try {
		Thread.sleep(700,500);//milisec,nanosec
	}catch(Exception e) {
		System.out.println(e);
	}
	}

	public static void main(String[] args) throws InterruptedException {
		
multi t1=new multi(); //thread created-t1-New
t1.setPriority(10);
t1.start(); //Start thread - runnable -ts
//t1.join(2500);//throws InterruptedException

multi t2=new multi();
t2.setName("second");
t2.start();



multi t3=new multi();
t3.setName("third");
t3.start();
	}

}
