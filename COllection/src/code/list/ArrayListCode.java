package code.list;

import java.util.*;
import java.util.Collections;
import java.util.ListIterator;

class ArrayListCode implements Runnable {
	@Override
	public void run() {
		
	
		ArrayList al=new ArrayList();
		List l2=Collections.synchronizedList(al);
		for(int i=0;i<10;i++) {
			l2.add(i);

		}
		
		ListIterator l1=l2.listIterator();
		while(l1.hasNext()) {
			System.out.println(Thread.currentThread().getName()+":"+l1.next());
			//System.out.println(l1.next());
		}

		
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("aa");
	Thread t1=new Thread(new ArrayListCode());
t1.start();
Thread t2=new Thread(new ArrayListCode());
t2.start();
	}


	}



