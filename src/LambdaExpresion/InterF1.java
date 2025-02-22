package LambdaExpresion;
@FunctionalInterface  //(with help of this funtional interface ke rules applicaple hone lagegge thabhi pata chalega ki ye fn interface bn chuka hai)
public interface InterF1 {
public void m1();
//public void m2(); //funtional interface must contain only i abstract method

//n no. of default methods can be defined
public default void m2() {
	System.out.println("");
}
public default void m3() {
	System.out.println("");
}
public default void m4() {
	System.out.println("");
}

//n no. of static methods are allowed
public static void m5() {
	System.out.println("");
}
public static void m6() {
	System.out.println("");
}
//protected static void m7() {  only public is allowed and java 11 onward private methods are also allowed
//	System.out.println("");
//}
}
