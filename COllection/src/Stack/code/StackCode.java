package Stack.code;

import java.util.Stack;

public class StackCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
System.out.println(s.capacity());
s.push("a");
s.push(1);
s.push(null);
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");
s.push("a123");

System.out.println(s);
System.out.println(s.clone());
System.out.println(s.peek());
System.out.println(s.search("1"));
System.out.println(s.search("a"));

System.out.println(s.capacity());
	}

}
