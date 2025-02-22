package generic;

public class GenericMethod6 {
public <T> void m1(T t) {
	
}
public <K> void m2(MyArrayList<K> list) {
	
}
public <T extends A> void m3(T t) {
	
}
public <T extends  A&Y> void m4(T t) {
	
}
public <T extends A,U> void m5(T t,U u) {
	
}
public <T extends B>void m6(T t) {
	
}
public static void main(String[] args) {
	GenericMethod6 g=new GenericMethod6();
	g.m1("twinkle");
	g.m1(10);
	g.m3(new A());
	g.m3(new B());
	g.m3(new C());
	g.m4(new W());
}
}