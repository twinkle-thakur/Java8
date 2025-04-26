package lockConcept;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
	public static void main(String[] args) {
		
		ReentrantLock lock=new ReentrantLock();
		System.out.println(lock.getHoldCount());
		System.out.println(lock.isLocked());
		System.out.println(lock.tryLock());
	//	lock.lock();
		//lock.unlock();
		System.out.println(lock.isFair());
	}

	
}
