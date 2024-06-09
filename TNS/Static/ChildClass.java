package Static;

public class ChildClass extends Calculation{
	private int salary;
	private static String name;
	static {
		System.out.println("HELLO!!");
		name = "YAGNIK KACHA";
	}

}

