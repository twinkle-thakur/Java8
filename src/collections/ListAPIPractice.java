package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.Map.Entry;

import StreamAPI.Database;
	import StreamAPI.Employee;
import StreamAPI.Employee2;

	public class ListAPIPractice {
	public static void main(String[] args) {
		List<Employee> list = Database.getEmployeeData();
		List<Employee> list2=Database.getEmployeeData();
		//1.public abstract int size();
		System.out.println(list.size());
		
		//2.public abstract boolean isEmpty();
		System.out.println(list.isEmpty());
		
		//3. public abstract boolean contains(java.lang.Object);
 //      System.out.println(list.contains(new Employee(10, "Riya", "TCS", 25000)));
		
		//4. public abstract java.util.Iterator<E> iterator();
			//	Iterator<Employee> iterator();
		Iterator<Employee> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
			 //       fail fast
			//when you want to get and modify data at same time it will show concorrent modification expection
			//becoz under loop 1 thread works at a time
			//list.add(new Employee(10, "Riya", "TCS", 25000)))
			//how to resolve this exception
			//copyonArrayList() becoz it stores copy of actual array
		}

		
		//5. public abstract java.lang.Object[] toArray();
	//	Object[] array=list.toArray();
		
		
		//6. public abstract <T> T[] toArray(T[]);
		
		
		
		//7. public abstract boolean add(E)
		list.add(new Employee(60, "khushi", "TCS", 55000));
		for(Employee e:list) {
	//		System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());;
		}
		
		//6.public abstract boolean remove(java.lang.Object);
		//	list.remove(new Employee(60, "khushi", "TCS", 55000));
		System.out.println("After removing");
		for(Employee e:list) {
	//		System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());;
		}
	
		
		//7.public abstract boolean containsAll(java.util.Collection<?>)
	//	System.out.println(list.containsAll(list2));
		
		//8.public abstract boolean addAll(java.util.Collection<? extends E>)
	//	list.addAll(list2);
		
		//9.public abstract boolean addAll(int, java.util.Collection<? extends E>)
		//java.util.Collection<? extends E>
	//	list.addAll(2,list2 );
		
		//10.public abstract boolean removeAll(java.util.Collection<?>);
//	    list.removeAll(list);
//	   System.out.println(list.size()); 
	   
	   //11.  public abstract boolean retainAll(java.util.Collection<?>);
//	   list.retainAll(list2);
//	   System.out.println(list.size()); 
	   
	   //12.  public default void replaceAll(java.util.function.UnaryOperator<E>)
	//   list.replaceAll();
	 
	  //13.  public default void sort(java.util.Comparator<? super E>);
		 Comparator<Employee> sortBy = (s1, s2) -> {
				int diff = (s1.getSalary()-s2.getSalary());
				if (diff == 0) {
					return s1.getName().compareTo(s2.getName());
				}

				return (diff);

			};
		list.sort(sortBy);
	
	   for(Employee e:list) {
	//		System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());
		}
	   
	   //14.public abstract void clear();
//	   list.clear();
//	   System.out.println(list.size());
	   
	   //15.  public abstract boolean equals(java.lang.Object);
	//  System.out.println( list.equals(list2));
	  
	  //16. public abstract int hashCode();
	//  System.out.println(list.hashCode());
	  
	  //17.public abstract E get(int)
       //list.get(0);
	   
	  
	  //18. public abstract E set(int, E);
	  list.set(0, new Employee(20,"tw","t",70));
	  for(Employee e:list) {
	//		System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());;
		}
	  
	//19.public abstract void add(int, E);
	  list.add(3, new Employee(30,"khushi","tcs",70000) );
	  for(Employee e1:list) {
//		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getCompany()+" "+e1.getSalary());;
		}
	  
	 //20. public abstract E remove(int) 
		list.remove(5);
	//	System.out.println("after removing");
		 for(Employee e1:list) {
	//			System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getCompany()+" "+e1.getSalary());;
			}
		 
	//21.public abstract int indexOf(java.lang.Object);
		 System.out.println("....indexof");
		 int indexOf = list.indexOf(new Employee(30,"khushi","tcs",70000) );
		 System.out.println(indexOf);
		 
	//22.public abstract int lastIndexOf(java.lang.Object);
		 
		 
	//23.  public abstract java.util.List<E> subList(int, int);
		 list.subList(0, 4);
		 
		 for(Employee e1:list) {
				System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getCompany()+" "+e1.getSalary());;
			}
		
	//24.  public default void addFirst(E);
		//list.addFirst(new Employee(10,"g","t",5));
		 for(Employee e1:list) {
		//	System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getCompany()+" "+e1.getSalary());;
						}
		 
		 
//	25.public default void addLast(E);
	
//	26.public default E getFirst();
	
	
//	27.public default E getLast();
		 
		 
//	28.public default E removeFirst();
		 
//	29.public default E removeLast()
		 
		 
//	30.public default java.util.List<E> reversed();
		 
//	31.public static <E> java.util.List<E> of();
		
		
//  public static <E> java.util.List<E> copyOf(java.util.Collection<? extends E>)	
		 
	}   
}

