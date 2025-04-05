package synchronization;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
private List<Integer> basket=new ArrayList<Integer>();
private static int capacity=10;
//1)check if basket is full
//2)if true then wait else add 
//3)notify consumer
//step 1 and 2 will be continous(while loop)
//step 3 will be continous
Runnable producer=()->{
	while(true) {
		synchronized (basket) {
			while(basket.size()==capacity) {
				try {
					basket.wait();//saman add nahi kr skte
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			boolean isAdded = basket.add(100);
			System.out.println("producer added an item "+isAdded);
			basket.notifyAll();//producer notify karega consumer ko
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
};
//1)check if basket is empty
//2)if true then wait else consume
//3)notify producer
//step 1 and 2 will be continous(while loop)
Runnable consumer=()->{
	while(true) {
		synchronized (basket) {
			while(basket.isEmpty()) {
				try {
					basket.wait();//basket se saman nahi le skte
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int item = basket.remove(0);
			System.out.println("Consume consumed item "+item);
			basket.notify();//consumer notify karega producer ko
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
};
Runnable consumer2=()->{
	while(true) {
		synchronized (basket) {
			while(basket.isEmpty()) {
				try {
					basket.wait();//basket se saman nahi le skte
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int item = basket.remove(0);
			System.out.println("Consume consumed item "+item);
			basket.notify();//consumer notify karega producer ko
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
};
public static void main(String[] args) {
	ProducerConsumer pc=new ProducerConsumer();
	Runnable producer2 = pc.producer;
	Runnable consumer2 = pc.consumer;
	Thread t1=new Thread(producer2);
	Thread t2=new Thread(consumer2);
	t1.start();
	t2.start();
}
}
