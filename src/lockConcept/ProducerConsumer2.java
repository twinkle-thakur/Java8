package lockConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer2 {
private	List<Integer> basket=new ArrayList<Integer>();
	private static int capacity=5;
	ReentrantLock lock=new ReentrantLock();
	Condition c=lock.newCondition();
	
	Runnable producer=()->{
		while(true) {
			lock.lock();
			try {
				while(capacity==basket.size()) {
					c.await();
				}
				boolean isAdded=basket.add(1);
				 System.out.println("Producer added an item :"+isAdded);
				c.signal();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	
Runnable consumer=()->{
	while(true) {
		lock.lock();
		try {
			while(basket.isEmpty()) {
				c.await();
			}
			int item = basket.remove(0);
			System.out.println("Consumer consumed an item :"+item);
			c.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		
	}
};	
public static void main(String[] args) {
	ProducerConsumer2 pc=new ProducerConsumer2();
	ExecutorService service = Executors.newFixedThreadPool(2);
	service.submit(pc.producer);
	service.submit(pc.consumer);
	service.shutdown();
}
}
