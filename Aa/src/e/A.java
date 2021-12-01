package e;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A {
	public static void main(String[] args) {
		File fa=new File("test.txt");
		System.out.println(fa.exists());
		System.out.println(fa.getName());
		System.out.println(fa.getParent());
		Employee d=new Employee("hello",22222);
		 try {
		FileWriter f = new FileWriter("test.txt");
         f.write(d.toString());
        
         f.flush();
         f.close();
           FileOutputStream fos=new FileOutputStream("test.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d);
			System.out.println(fa.canRead());
			oos.close();
			
			FileInputStream fis=new FileInputStream("test.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			System.out.println((Employee)ois.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class Employee implements Serializable{
	private String name;
	private int salary;
	 Employee(String name,int salary){
		 this.name=name;
		 this.salary=salary;
	 }
	@Override
	 public String toString() {
		 return name+salary;
	 }
	
}



