package code.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorCode  implements Runnable{
	public void run() {
		
	
		Vector al=new Vector();
	//System.out.println("First"+al.capacity());
		for(int i=0;i<10;i++) {
			//if(i%2==0) {
				al.add(i);
			//}else {
				//al.remove(i);
			//}
		

		}
		System.out.println("Second"+al.capacity());
		ListIterator l1=al.listIterator();
		while(l1.hasNext()) {
			//if((l1.hasNext())%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+l1.next());
	//	}else {
			//al.remove(l1.next());
	//	}
	
			
			//System.out.println(l1.next());
		}

		
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("aa");
	Thread t1=new Thread(new VectorCode());
t1.start();
Thread t2=new Thread(new VectorCode());
t2.start();
	}


	}
