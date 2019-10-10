package code.javaeight;

import java.util.*;
import java.util.stream.Collectors;

public class LambadaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
al.add(10);
al.add(20);
al.add(5);
al.add(30);
al.add(0);
System.out.println("Before Sorting Techniue "+al);
//Comparator<Integer>c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
Comparator<Integer>c=(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0;
Collections.sort(al,c);
System.out.println("After Sorting Techniue "+al);

List <Integer> l=al.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println("Even  Techniue "+l);
	}

}
