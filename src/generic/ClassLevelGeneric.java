package generic;
//Basic Principle in any progarming language:
//each instruction must be detereministic(unique) means no ambiguity
//Class extends Class
//Interface extends Interface
//Class implements Interface
//here before using implements or extends keyword we must know both of the types like above then only 
//we can decide impelements or extends otherwise we can't
//Likewise in generic we know only 1 type or none
//so wrt generic concept we have 2 option to use :- extends or implements keyword 
//but as per basic principle in programing lang every inst must be deterministic so Java designers opted
//extends keyword.
public class ClassLevelGeneric<T extends A,U extends X> {

}
//?(wildcard) is not applicable on class level in generic
class ClassLevel<?>{
	
}
//super is also not applicable on class level in generic
class ClassLevel1<T super U>{
	
}
//gadha upper expalin kiya hua hai
class ClassLevel2<T implement U>{
	
}
