package methodfeagturesAndConstructorReference;

public class ConstructorReferenceMultipleArguments {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceConstructorWithMultipleArgument i=Student::new;
		i.get(10, "worli", "vikram");
	}

}
