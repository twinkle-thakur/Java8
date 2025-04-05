package synchronization;

import java.util.ArrayList;
import java.util.List;
//Kartik=producer
//Twinkle=consumer
public class KartikTwinkle {
	private static int capacity=10;
	private List<Integer> basket=new ArrayList<>();
	//1)check if basket is full 
	//2)if true then wait else add item
	//3)notify customer
	//4)step 1 and 2 will be repeated continously (while loop)
	//5)notify customer continously
Runnable producer=()->{
	while(true) {
		synchronized (basket) {
		 while(basket.size()==capacity) {
			 try {
				basket.wait();//basket me item nahi dal skte(producer)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 boolean item = basket.add(10);//basket me item dalo (producer)
		 System.out.println("kartik added an item "+item);
		 basket.notify();//Kartik notify karega Twinkle ko 
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
};

//1)check  basket is empty
//2)if true then wait else consume
//3)notify kartik(producer)
//4)step 1 and 2 will be continous (while loop)
//5)step 3 will be continous
Runnable consumer=()->{
	while(true) {
		synchronized (basket) {
			while(basket.isEmpty()) {
				try {
					basket.wait(); //basket se item nahi le skte(consumer)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int item = basket.remove(0);//basket se item le lo(consumer)
			System.out.println("Twinkle consumed "+item);
			basket.notify();//twinkle notify karegi kartik ko
		
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
};
public static void main(String[] args) {
	KartikTwinkle kt=new KartikTwinkle();
	Runnable kartik = kt.producer;
	Runnable twinkle = kt.consumer;
	Thread t1=new Thread(kartik);
	Thread t2=new Thread(twinkle);
	t1.start();
	t2.start();
}

}
