package Iterator.code;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		
for(int i=0;i<10;i++) {
	v.addElement(i);
	
}
ListIterator l1=v.listIterator() ;
while (l1.hasNext()) {
	System.out.println(l1.next());
	
}
ArrayList al =new ArrayList();
for(int i=0;i<10;i++) {
	al.add(i);
	
}
Iterator e1=al.iterator() ;
while (e1.hasNext()) {
	System.out.println(e1.next());
	
}


	}

}
