package generic;
//How to make a Class generic
//Here T can be of any type(int,float,string...)
public class GenericClass1<T> {

	private T box;
	public void set(T box) {
		this.box=box;
	}
	public T get() {
		return box;
	}
	public static void main(String[] args) {
	GenericClass1<Integer> g=new GenericClass1<>();
	g.set(20);
	System.out.println(g.get());
	
	GenericClass1<String> g1=new GenericClass1<>();
	g1.set("khushi");
	System.out.println(g1.get());
	}
}
