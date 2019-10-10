package methodfeagturesAndConstructorReference;

public class ConstructorReference {


	public static void main(String[] args) {
		interfaceConstructorReference f=Sample::new;
		Sample s1=f.get();
		Sample s2=f.get();
		Sample s3=f.get();
	}

}

