package StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Q2.fetch all employee names
//Q3.fetch distinct companies name
//Q4.fetch the employee who has highest salary
//Q5.fetch all those employes working for tcs
//Differnce b/n Collestion & stream
public class EmployeTestByStreamAPI {
public static void main(String[] args) {
	List<Employee> list = Database.getEmployeeData();
	//Q2.fetch all employee names
	list.stream().map(t->t.getName()).collect(Collectors.toList()).forEach(System.out::println);

	//Q3.fetch distinct companies name
	list.stream().map(t->t.getCompany()).distinct().collect(Collectors.toList()).forEach(System.out::println);

    //Q4.fetch the employee who has highest salary

	Comparator<Employee> highestSal=(s1,s2)->s2.getSalary()-s1.getSalary();
	
	Employee employee = list.stream().sorted(highestSal).findFirst().get();
	System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getCompany()+" "+employee.getSalary());
	
	//using max funtion
////	Optional<T> max(Comparator<? super T> comparator);
//	// int compare(T o1, T o2);
	Optional<Employee> max = list.stream().max((e1, e2)->e1.getSalary()-e2.getSalary());

	Employee employeeM = max.get();
	System.out.println(employeeM.getId()+" "+employeeM.getName()+" "+employeeM.getCompany()+" "+employeeM.getSalary());
	
//if to print salary only
	Comparator<Integer> sort =(s1,s2)->s2-s1;
	Integer maxSalary = list.stream().map(Employee::getSalary).max((s1,s2)->s1-s2).get();
	System.out.println(maxSalary);
	
//Q5.fetch the employee who has second highest salary	
	System.out.println("fetch the employee who has second highest salary ");
	Employee employee2 = list.stream().sorted(highestSal).collect(Collectors.toList()).get(1);
	System.out.println(employee2.getId() +" "+employee2.getName()+" "+employee2.getCompany()+" "+employee2.getSalary());

	
	//Q5.fetch all those employes working for tcs
	list.stream().filter(t->"tcs".equalsIgnoreCase(t.getCompany())).collect(Collectors.toList()).forEach(e->System.out.println(e.getId()+" "+e.getName()+" "+e.getCompany()+" "+e.getSalary()));   
}

} 