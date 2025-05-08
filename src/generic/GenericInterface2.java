package generic;

public interface GenericInterface2<T> {
void add(T t);
T get();
}
class A implements GenericInterface2<String>{

	@Override
	public void add(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
