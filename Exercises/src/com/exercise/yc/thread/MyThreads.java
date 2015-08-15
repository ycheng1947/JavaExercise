package com.exercise.yc.thread;

/*public class MyThreads implements Runnable{
	
	private Foo foo = new Foo();
	private static int x ;
	public static void main(String[] args) {
		
		MyThreads trd = new MyThreads();

		Thread trd1 = new Thread(trd);		
		Thread trd2 = new Thread(trd);
		Thread trd3 = new Thread(trd);		
		Thread trd4 = new Thread(trd);
		
		trd1.start();
		trd2.start();
		trd3.start();
		trd4.start();
	
	}
	@Override
	public void run() {
		
		 for(int i = 0;i<100;i++){
			 
			  this.fix(20);
			 System.out.println("The current x is "+foo.getX()+" ,and the current thread is "+Thread.currentThread());
//			 try {
//				Thread.sleep(1000*3);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		 }
	}
	
	public int fix(int y){
		return foo.fixX(y);
	}

}
*/

public class MyThreads implements Runnable { 
    private Foo foo = new Foo(); 

    public static void main(String[] args) { 
    	MyThreads r = new MyThreads(); 
        Thread ta = new Thread(r, "Thread-A"); 
        Thread tb = new Thread(r, "Thread-B"); 
        ta.start(); 
        tb.start(); 
    } 

    public void run() { 
        for (int i = 0; i < 3; i++) { 
            this.fix(30); 
            try { 
                Thread.sleep(1); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
            System.out.println(Thread.currentThread().getName() + " : 当前foo对象的x值= " + foo.getX()); 
        } 
    } 

    public int fix(int y) { 
        return foo.fixX(y); 
    } 
}