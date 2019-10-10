package Set.code;

import java.util.Comparator;

public class MyComparator implements Comparator {


@Override
public int compare(Object obj1,Object obj2) {
	// TODO Auto-generated method stub
	EmployeeTreeSet e1=(EmployeeTreeSet)obj1;
	EmployeeTreeSet e2=(EmployeeTreeSet)obj2;
	String s1=e1.name;
	String s2=e2.name;
	return s1.compareTo(s2);
}
}
