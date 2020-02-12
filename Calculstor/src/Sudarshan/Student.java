package Sudarshan;

import java.util.Comparator;

public class Student {
	private int id;
	private String name;
	private double percentage;
	

	public Student(int id, String name, double d) {
		this.id = id;
		this.name = name;
		this.percentage = d;
	}


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}


	public static Comparator sortByName=new Comparator<Student>() {

		@Override
		public int compare(Student arg0, Student arg1) {

			return arg0.getName().compareTo(arg1.getName());
		}	
	};
	public static Comparator sortById=new Comparator<Student>() {

		@Override
		public int compare(Student arg0, Student arg1) {
			return arg0.getId()-arg1.getId();
		}
		
	};
	public static Comparator sortByPecentage=(Object arg0, Object arg1) -> {
		return (int) (((Student)arg0).getPercentage()-((Student)arg1).getPercentage());
		
	};

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

}
