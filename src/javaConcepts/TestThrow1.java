package javaConcepts;

public class TestThrow1 {
	 void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		TestThrow1 obj = new TestThrow1();
		obj.validate(19);
		System.out.println("rest of the code...");
	}

}
