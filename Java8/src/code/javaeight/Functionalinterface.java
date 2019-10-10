/*we can declafre n number of static and default methods in functional interface.*/
package code.javaeight;
/*@FunctionalInterface
public interface Functionalinterface {
	 public void m1();
	in java 8 onwards we can use static and default methods in functional interface.Main criteria is functional interface  contains only one abstract method.
	 
	default void m2() {
		
	}
	public static void m3() {}
}
*/
/*it will give compile error because functional interface contains only one abstract method.
 @FunctionalInterface
 
 public interface Functionalinterface {
	// public void m1();
	
	default void m2() {
		
	}
	public static void m3() {}
}

 */
/*it will give compile fine because its normal interface.


public interface Functionalinterface {
	// public void m1();
	
	default void m2() {
		
	}
	public static void m3() {}
}

*/
/*
if we declare interface with atleast one abstract method then also we can say that its functional interface.means it will work like functional interface.
public interface Functionalinterface {
	 public void m1();
	
	default void m2() {
		
	}
	public static void m3() {}
}

*/
/*
it will give compile time error we cant define more than one abstract method in functional interface
@FunctionalInterface
public interface Functionalinterface {
	 public void m1();
	 public void m11();
	default void m2() {
		
	}
	public static void m3() {}
}

*/

 
 