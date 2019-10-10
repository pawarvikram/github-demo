package code.javaeight;
import java.util.function.*;

public class LambadaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 there is no need to use method name,return type,modifier.
		 import java.util.function.*;functional interface comes under this package
		 */
Function<Integer,Integer> f=a->a*a;

		 System.out.println("print values"+f.apply(10));
}
 
	
}