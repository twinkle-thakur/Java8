package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericConcept {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();//here default type is Object
		list.add(10);
		list.add("twinkle");
		list.add(true);
		list.add(567.5);
		int rollNo=(int)list.get(1);//we will get classCastException
		//to resolve classCastException we have to learn generic concept
		//in other words with the help of generic we can resolve classCastException
		//generic concept is introduced in java 1.5 version
		//Notation <> (angular bracket)
		ArrayList<Integer> list2=new ArrayList<Integer>();//acc to java 1.5 version
		ArrayList<Integer> list3=new ArrayList();//java 1.7 onwards
		list3.add(10);
		//list3.add("twinkle");
//		list3.add(true);
//		list3.add(45.7);
		
	
	//	ArrayList<Parent> list=new ArrayList<Child>(); polymorphism concept is applicaple only for the base type,not for parameter type
	List<Parent> list5=new ArrayList<Parent>();//tis is valid becoz polymorphims concept is applicable on base type
//	ArrayList<int> list6=new ArrayList<int>(); parameter type must be class or Interfac,not Primitive type
	ArrayList<Float> list7=new ArrayList<Float>();
	long l=50;
	int i=10;
	short s=20;
	byte b=30;
//	list7.add(50.5F);
//	list7.add(l);
//	list7.add(i);
//	list7.add(s);
//	list7.add(b);
	//here primitive ype is apllicaple
	float[] arr=new float[5];
	arr[0]=10;
	arr[1]=l;
	arr[2]=i;
	arr[3]=s;
	arr[4]=b;
//	arr[1]="kartik";
	
	
	
	
	
	
	}

}
