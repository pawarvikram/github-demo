package Set.code;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		LinkedHashSet lh=new LinkedHashSet(h);
		lh.add("a");
	
		lh.add("b");
	    lh.add("$");
		lh.add("c");
		lh.add("t");
		lh.add("y");
		lh.add("u");
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("C");
	lh.add(11);
		System.out.println(lh);
		Iterator i=lh.iterator();
		while(i.hasNext()) {
			System.out.println(i.next().hashCode());
		}

	}

}
