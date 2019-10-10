package code.javaeight;
//functional interface w.r.t. inheritance

 //Below example is valid because parent interface A m1() method is by default available to B .Hence in order to functionale interface below criteria is fullfilled.
 

/*@FunctionalInterface
public interface B extends A {
	 
	
}*/

/*Example is valid because we are overiding method 
@FunctionalInterface
public interface B extends A {
	 
	public void m1();
}

*/
/*Functional interface we cant declare more than one method.
@FunctionalInterface
public interface B extends A {
	 
	public void m2();
}*/

/*
 //Example is valid because its normal interface.In normal interface we can declared the n number of interface. 
 

public interface B extends A {
	 
	public void m2();
}*/