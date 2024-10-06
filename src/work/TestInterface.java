package work;

//@FunctionalInterface
public interface TestInterface {


	void Display(int a, int b);
	
	
	
	default void m1() {System.out.println("m1()...");}
	default void m2() {}
	default void m3() {}
		
	
	
	static void s1() {}
	static void s2() {}
	static void s3() {}
	
	
	
}
