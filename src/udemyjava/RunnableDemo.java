package udemyjava;

public class RunnableDemo implements Runnable {

	//thread scheduler
	public void run() {//CS
		for(int i=1;i<=10;i++)
			System.out.println(i);
		
	}
	public static void main(String[] args) {//main thred
	//multi t1=new multi();//thread created -t1-new
//	t1.start();//runnable -TS
	
	//multi t2=new multi();
	//t2.start();
		
		Runnable r1=new RunnableDemo();
		Runnable r2=new RunnableDemo();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
	//	t1.start();//runnable
		//t2.start();//runnable
		
		t1.run();//normal method
		t2.run();//normal method
		
		
	}

}
