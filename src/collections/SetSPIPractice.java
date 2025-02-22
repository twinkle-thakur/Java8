package collections;

import java.util.Set;
import java.util.TreeSet;

public class SetSPIPractice {
public static void main(String[] args) {
	Set<Integer> set=new TreeSet<>();
	set.add(10);
	set.add(5);
	set.add(6);
	set.add(20);
//1.	public abstract int size();
	System.out.println(set.size());
	
//2.   public abstract boolean isEmpty();
	System.out.println(set.isEmpty());
	
//3.   public abstract boolean contains(java.lang.Object);
	System.out.println(set.contains(6));
	
//4.   public abstract java.util.Iterator<E> iterator();
//	for(Integer i:set) {
//		System.out.print(i+" ");
//	}
	System.out.println(set);
//5.   public abstract java.lang.Object[] toArray();
	Object[] array=set.toArray();
	 System.out.println(set);

//6. public abstract boolean add(E);
	set.add(50);
	System.out.println(set);
	
//7.  public abstract boolean remove(java.lang.Object);
	set.remove(10);
	System.out.println(set);
	
//8.  public abstract boolean containsAll(java.util.Collection<?>);
	Set<Integer> set2=new TreeSet<>();
	set2.add(20);
	System.out.println(set.containsAll(set2));
	
//9. public abstract boolean addAll(java.util.Collection<? extends E>);	
	set.addAll(set2);
	System.out.println(set);
	
//10. public abstract boolean retainAll(java.util.Collection<?>);
	set.retainAll(set2);  //give common values
	System.out.println(set);
	
//11.  public abstract boolean removeAll(java.util.Collection<?>);
	set.removeAll(set);
	System.out.println(set);
	
//12.public abstract void clear();
	set.clear();
	System.out.println(set);
	
//13.public abstract boolean equals(java.lang.Object);
	System.out.println(set.equals(set2));
	
//14.public default java.util.Spliterator<E> spliterator();
	
//15.public static <E> java.util.Set<E> copyOf(java.util.Collection<? extends E>);	
     

}
}
