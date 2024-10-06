package work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Work {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("========for loop Approach==========");

		// apporach 1
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// apporach 2
		System.out.println("=======for each loop=========");
		for (Object obj : al) {
			System.out.println(obj);
		}
		
		//Apporach 3
		System.out.println("===========Iterator Apporach================");
		Iterator iterator = al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//Apporach 4
		System.out.println("==========ListIterator Apporach=================");

		ListIterator listIterator=al.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		//Apporach 5
		System.out.println("==========For each Apporach===============");
		al.forEach(i -> {
			System.out.println(i);
		});
		
	}
}
