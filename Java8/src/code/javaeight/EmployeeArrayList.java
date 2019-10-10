package code.javaeight;
import java.util.*;
public class EmployeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		List <Employee> l=new ArrayList<Employee>();
		
		l.add(new Employee(1,"vikram"));
		l.add(new Employee(3,"aditya"));
		l.add(new Employee(2,"mayur"));
		l.add(new Employee(5,"sanket"));
		l.add(new Employee(6,"aniket"));
		//we were sorting on the basis of emp no.
		System.out.println(l);
	Collections.sort(l,	(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
	System.out.println(l);
	Collections.sort(l,	(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
	System.out.println(l);
	Collections.sort(l,	(e1,e2)->e1.name.compareTo(e2.name));
	System.out.println(l);
	Collections.sort(l,	(e1,e2)->e2.name.compareTo(e1.name));
	System.out.println(l);
	}

}
