package Set.code;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeTreeSet e1=new EmployeeTreeSet("vikram",100);
		EmployeeTreeSet e2=new EmployeeTreeSet("vikram",101);
		EmployeeTreeSet e3=new EmployeeTreeSet("shubhada",102);
		EmployeeTreeSet e4=new EmployeeTreeSet("dilip",103);
		EmployeeTreeSet e5=new EmployeeTreeSet("prathmesh",100);
		EmployeeTreeSet e6=new EmployeeTreeSet("nirmala",105);
		EmployeeTreeSet e7=new EmployeeTreeSet("sanket",100);
		EmployeeTreeSet e8=new EmployeeTreeSet(null,1000);
		TreeSet t =new TreeSet();
t.add(e1);
t.add(e2);
t.add(e3);
t.add(e4);
t.add(e5);
t.add(e6);
t.add(e7);
System.out.println(t);
TreeSet t1 =new TreeSet(new MyComparator());
t1.add(e1);
t1.add(e2);
t1.add(e3);
t1.add(e4);
t1.add(e5);
t1.add(e6);
t1.add(e7);
t1.add(e8);
System.out.println(t1);
	}

}
