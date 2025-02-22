package generic;

public class GenericMethod {
//?(wildcard generic ())
//this () is usefull for read only operation except null	
public void m1(MyArrayList<?> list) {
//	list.add(null); valid
//	list.add("twinkle"); invalid
//	list.add(10); invalid
	
}
public static void main(String[] args) {
	GenericMethod g=new GenericMethod();
	MyArrayList<String> list1=new MyArrayList<>();
	list1.add("twinkle");
	list1.add("twinkle");
	MyArrayList<Integer> list2=new MyArrayList<>();
	g.m1(list1);
	g.m1(list2);
}
}
