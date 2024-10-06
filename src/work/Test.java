package work;

import java.util.Properties;

public class Test {

	
	public static void printSystmProperties() {
		System.out.println("printingsystem properties");
		Properties props=System.getProperties();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("java program started..");
		
		printSystmProperties();
	}

}
