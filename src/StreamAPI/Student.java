package StreamAPI;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator<Student>{
private int id;
private String name;
private String branch;
private String college;
private double cgpa;

public Student() {
	super();
}
public Student(int id, String name, String branch, String college, double cgpa) {
	super();
	this.id = id;
	this.name = name;
	this.branch = branch;
	this.college = college;
	this.cgpa = cgpa;
}
public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getBranch() {
	return branch;
}

public String getCollege() {
	return college;
}

public double getCgpa() {
	return cgpa;
}



//@Override
//public int compareTo(Student s) {
//	return Double.compare(this.cgpa, s.getCgpa());
//	
//}
@Override
public int compare(Student s1, Student s2) {
	return Double.compare(s1.cgpa, s2.getCgpa());
	
}




}
