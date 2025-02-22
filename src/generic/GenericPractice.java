package generic;

import java.util.ArrayList;
//to ans below Q, ask yourself what type of obj it is going to store
public class GenericPractice {
public static void main(String[] args) {
	ArrayList<?> list=new ArrayList<>();
	ArrayList<?> list2=new ArrayList<String>();
	ArrayList<?> list3=new ArrayList<Integer>();
//	ArrayList<? extends B> list4=new ArrayList<Integer>();  invalid
//	ArrayList<? extends B> list5=new ArrayList<A>();
//	ArrayList<? extends Y> list6=new ArrayList<Integer>();
//	ArrayList<? extends Y> list7=new ArrayList<X>();
	ArrayList<? extends Y> list8=new ArrayList<Y>();
	ArrayList<? extends Y> list9=new ArrayList<Z>();
//	ArrayList<?> list10=new ArrayList<?>(); Q ka  ans Q ni hota
//	ArrayList<?> list11=new ArrayList<? extends A>();
}
}
