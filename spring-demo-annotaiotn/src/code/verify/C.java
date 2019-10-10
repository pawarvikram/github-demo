package code.verify;

import org.springframework.stereotype.Component;

@Component
public class C {
	String s;
public C(String s) {
		super();
		this.s = s;
	}
public String m3() {
	return "inside class c";
}
}
