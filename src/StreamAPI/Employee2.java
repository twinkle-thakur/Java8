package StreamAPI;

import java.util.Collections;
import java.util.List;

public class Employee2 implements Comparable<Employee2>{
private int id;
private String name;
private String company;
private int salary;
public Employee2() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee2(int id, String name, String company, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.company = company;
	this.salary = salary;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getCompany() {
	return company;
}
public int getSalary() {
	return salary;
}
@Override
public int compareTo(Employee2 e) {
	int diff=this.getSalary()-e.getSalary();
	if(diff==0) {
		return this.getName().compareToIgnoreCase(e.getName());
	}
	return diff;
}

@Override
public String toString() {
	return "Employee2 [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
}
public static void main(String[] args) {
	List<Employee2> data = Database.getEmployee2Data();
	Collections.sort(data);
	
	//System.out.println(data);
	
//without using toString	
//	for(Employee2 e:data) {
//		System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());
//	}
	
	//Using stream API
	data.stream().sorted().forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary()));
}
}

	
