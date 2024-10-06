package modifiersJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import work.Work1;

public class Modifiers implements Serializable {
	
    int i=10, j=20;
	
	transient  int k=30;
	
	transient static int l=40;
	transient final int m=50;

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub

		Modifiers input=new Modifiers();
		 
		 FileOutputStream fos=new FileOutputStream("abc1.txt");
		 
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(input);
		 //System.out.println(oos);
		 
		 FileInputStream fis=new FileInputStream("abc1.txt");
		 
		 ObjectInputStream ois=new ObjectInputStream(fis);
		 
		 Modifiers output=(Modifiers) ois.readObject();
		
		 System.out.println("i= " + output.i);
		 System.out.println("j= " + output.j);
		 System.out.println("k= " + output.k);
		 System.out.println("l= " + output.l);
		 System.out.println("m= " + output.m);
	}

}
