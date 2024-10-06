package demo;


public	class A {
		 
		public void print(String str){
			System.out.print("String");
		}
		 
		public void print(Integer str){
			System.out.print("Integer");
		}
		 
		public void print(Object str){
			System.out.print("Object");
		}
		 
		public static void main(String[] args) {
			A obj = new A();
			//obj.print(null);
		}
		}
