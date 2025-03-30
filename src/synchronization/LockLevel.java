package synchronization;

public class LockLevel {
public synchronized void m1() {
	System.out.println(Thread.currentThread().getName());
	{
		System.out.println("m1() synchronized block");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("m1() non synchronized block");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void m8() {
	System.out.println(Thread.currentThread().getName());
	{
		System.out.println("m1() synchronized block");
		synchronized (this) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	System.out.println("m1() non synchronized block");
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void m4() {
	SynchronizationConcept sc=new SynchronizationConcept();
	synchronized(sc){
		
	}
}
public void m6(SynchronizationConcept sc) {
	synchronized(sc){
		
	}
}
public synchronized void m2() {
	System.out.println("m2() non synchronized block");
}
public void m3() {
	 synchronized(LockLevel.class){
		 System.out.println("m3()  synchronized block");	
	}
	 System.out.println("m3() non synchronized block");
}
public static synchronized void m7() {
	System.out.println("m7() non synchronized block");
}
}
