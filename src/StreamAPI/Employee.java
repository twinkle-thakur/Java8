package StreamAPI;

import java.util.Comparator;
import java.util.List;

public class Employee {
private int id;
private String name;
private String company;
private int salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String company, int salary) {
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
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
}
public static void main(String[] args) {
	//1.sort employee by their salary if salary matches then sort by  names
	// using Comparator technique and streamAPI
	List<Employee> list = Database.getEmployeeData();
	  Comparator<Employee> sortBy = (s1, s2) -> {
			int diff = (s1.getSalary()-s2.getSalary());
			if (diff == 0) {
				return s1.getName().compareTo(s2.getName());
			}

			return (diff);

		};
	list.sort(sortBy);
//	System.out.println(list);
	
	//without using toString
//	for(Employee e:list) {
//		System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary());
//	}
	
	//Using stream API
	list.stream().sorted(sortBy).forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary()));
	}
}


