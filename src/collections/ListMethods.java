package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMethods {
public static void main(String[] args) {
	//method 1 to create List
	List<Integer> list=new ArrayList<Integer>();
	
	//method 2
	//Creating another list using asList
		//we cant add or remove values but we can only replace values
		List<Integer> list2 = Arrays.asList(1,2,3); //this returns a fixed size List
		list2.set(0, 5);//we can only replace values
		System.out.println(list2);
		
		//method3
		//creating list using array
		String[] arr= {"khushi","om","twinkle"};
		List<String> list3 = Arrays.asList(arr);
		
		//method 4
		//in new versions of java (java 9)we can create list using of()
		//but here we cant modify list once it is created
		//List<Integer> list4 = List.of(2,4,6,8,0); 
		
	//add
	list.add(10);
	list.add(20);
	list.add(30);
	
	//add at index
	list.add(2, 25);
	System.out.println(list);
	
	//addAll
	list.addAll(list2);
	System.out.println(list);
	
	//replace old value at given index with new value 
	list.set(0, 12);
	System.out.println(list);
	
	//remove
	list.remove(0);
	System.out.println(list);
	
//	when we want to remove by value
	list.remove(Integer.valueOf(20));//becoz mow 20 is obj
	System.out.println(list);
	
//we can convert list to array
//	Object[] array = list.toArray();
//	for(Object i:array) {
//		System.out.print(i+" ");
//	}
	
//we can also add type of array
//	Integer[] array2 = list.toArray(new Integer[0]);//0 size ki array
//	for(Integer i:array2) {
//		System.out.print(i+" ");
//	}
	
//sorting array
	list.sort(null); 
	//or
	Collections.sort(list);
	System.out.println(list);
	
//sort() will sort list in ascending order which is natural sorting
//but when we want to perform custom sorting we use Comparator	
	
//using lambda expresion
	list.sort((a,b)->b-a);
	System.out.println(list);
	
	
}
}
