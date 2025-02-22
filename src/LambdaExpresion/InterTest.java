package LambdaExpresion;

public class InterTest {
public static void main(String[] args) {
//	public void m1();
//its lambda expresion is	
	InterF1 f=()->{System.out.println("twinkle");};
	//becoz of 1 statement we can remove {}
	InterF1 f1=()->System.out.println("twinkle");
	f1.m1();
	
	
	//Traditional approach
	InterF1 f2=new A();
	f2.m1();
	
	//interF2
	//public void m1(int a,int b) ; its lamda ex
	//f3,f4,f5 will give same result
	InterF2 f3=(int a,int b)->{System.out.println(a+" "+b);};
	//argument type is optional
//NOTE: compiler knows automaticaly method agrument type which is called type inference
//	in funtional tnterface, it must contain only 1 abstract method
	InterF2 f4=( a, b)->{System.out.println(a+" "+b);};
	//becoz of 1 statement we can remove {}
	InterF2 f5=( a, b)->System.out.println(a+" "+b);
	f3.m1(10, 20);
	
	//interF3
	//public int add(int a,int b); its lambda ex
	InterF3 f6=(int a,int b)->{return a+b;};
	InterF3 f7=( a, b)->{return a+b;};//agr optional
	InterF3 f8=( a, b)-> a+b; //only 1 statement then {} are optional but with return word remove return also
	int sum=f8.add(2, 10);
	System.out.println(sum);
	
	//interF4
	//public void m1(); 
	InterF4 f9=()->{System.out.println("twin");};
	InterF4 f10=()->System.out.println("twin");
	f10.m1();
	
	//interF5
	//public void m1(String s);
	InterF5 f11=(String s)->{System.out.println(s);};
	InterF5 f12=(s)->{System.out.println(s);};
	InterF5 f13=s->{System.out.println(s);};
	InterF5 f14=s->System.out.println(s);
	f14.m1("khu");
}
}
