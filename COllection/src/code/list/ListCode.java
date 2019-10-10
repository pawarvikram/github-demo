package code.list;
import java.util.*;
public class ListCode {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l1=new ArrayList();
l1.add("vikram");
l1.add("vikram");
l1.add("vikram");
l1.add("vikram");
l1.add("shubhada");
l1.add(1);
l1.size();
System.out.println("print all the list"+l1);
ListIterator i=l1.listIterator();
while(i.hasNext()) {
	System.out.println("print all the listiterator"+i.next());
	
}
Iterator i1=l1.iterator();
while(i1.hasNext()) {
	System.out.println("print all iterator list"+i1.next());
	
}


	}

}
