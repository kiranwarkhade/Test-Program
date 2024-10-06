package modifiersJava;

import java.io.Serializable;

public class Non_Modifires {

	// 1
	class Counter {
		static int count = 0;

		static void increment() {
			count++;
		}
	}

	// 2
	final int MAX_VALUE = 100;

	final class ImmutableClass {
		// Cannot be subclassed
	}

	// 3
	abstract class Animal {
		abstract void sound();
	}

	class Dog extends Animal {
		void sound() {
			System.out.println("Bark");
		}
	}

	// 4
	class Counter1 {
		private int count = 0;

		synchronized void increment() {
			count++;
		}
	}

	// 5
	class SharedResource {
		volatile int value;

		void updateValue() {
			value = 42;
		}
	}

	// 6
	class User implements Serializable {
		String name;
		transient String password; // Won't be serialized
	}

	// 7
	class Example {
		native void nativeMethod(); // Must be implemented in native code
	}

	public static void main(String[] args) {
		Counter.increment();
		System.out.println(Counter.count); // Output: 1
	}
}
