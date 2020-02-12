package Sudarshan;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


public class Test {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet<Student>(Student.sortByName);
		ts.add(new Student(5, "Gowtham", 75.75));
		ts.add(new Student(1, "Sudarshan", 74.04));
		ts.add(new Student(4, "Mahek", 80.05));
		ts.add(new Student(3, "Prothomesh", 70.00));
		ts.add(new Student(2, "Karthik", 72.02));
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for sort by ID");
		System.out.println("Enter 2 for sort by Name");
		System.out.println("Enter 3 for sort by Percentage");
		System.out.println("Enter the sorting Method");
		
		int a=sc.nextInt();
		Comparator b=null;
		switch(a)
		
		{
			case 1:b=Student.sortById;
				break;
			case 2:b=Student.sortByName;
			    break;
			case 3:b=Student.sortByPecentage;	
				break;
			
		}
		

		
		
		System.out.println(ts);
		
	}

}
