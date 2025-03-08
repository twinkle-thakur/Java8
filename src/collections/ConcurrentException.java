package collections;
/*
 *Q1) what is a concurrent modification Exception, have you faced this Exception ever?
 * it is a runtimeException.Whenever you want to iterate the list and at the same
 * time you also want to do the modification then you will get 
 * Concurrent modificationException.(this is also known as "fail fast")
 *  Q2)how you will resolve this problem?
 *  use copyOnArrayList instead of arrayList(this process is also known as "fail safe")
 *  
 * */
public class ConcurrentException {

}
