package controlstatements;

public class MathUtils {

	static int counter = 0;

	static void increment() {
		counter++;
	}

	public static void main(String[] agrs) {

		MathUtils.increment();
		System.out.println(MathUtils.counter);

	}

}