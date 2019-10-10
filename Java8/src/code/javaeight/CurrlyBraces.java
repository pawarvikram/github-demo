package code.javaeight;

import java.util.function.Function;

public class CurrlyBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*If we r returning the values then we should use curly braces.
		 If we r not returning the values then we should not  use curly braces.*/
		Function<Integer,Integer> f=a->a*a;
		
		Function<Integer,Integer> s= i->{return i*i;};
		
		//Function<Integer,Integer> thrd=i-> return i*i;
		
		//Function<Integer,Integer> thrd=i-> { i*i;};

		// System.out.println("print values"+f.apply(10));
		 
		// System.out.println("print values"+f.apply(10));
}
	}


