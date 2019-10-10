package Set.code;

import java.util.Comparator;

public class EmployeeTreeSet implements Comparable {
String name;
int eid;
	EmployeeTreeSet(String name,int eid){
		this.name=name;
		this.eid=eid;
	}
public String	toString(){
	return name+""+eid;
		
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int eid1=this.eid;
		EmployeeTreeSet e= (EmployeeTreeSet)obj;
		int eid2=e.eid;
		if(eid1>eid2) {
			return 1;
		}else if(eid1<eid2) {
			return -1;
		}else {
			return 0;
		}
	}

}
