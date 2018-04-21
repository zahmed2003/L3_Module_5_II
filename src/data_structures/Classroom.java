package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class Classroom 
{
	ArrayList<Student> students = new ArrayList<Student>();
	Random r = new Random();
	int sumIntellect = 0;
	double averageIntellect;
	
	public static void main(String[] args) {
		Classroom c = new Classroom();
		c.addStudents(8);
		c.getAverage();
	}
	
	public void addStudents(int numPeople)
	{
		for(int i = 0; i < numPeople; i++)
		{
			students.add(new Student(r.nextInt(50) + 100));
		}
	}
	
	public void getAverage()
	{
		for(int j = 0; j < students.size(); j++)
		{
			sumIntellect = sumIntellect + students.get(j).subjectiveIntelligenceLevel;
		}
		
		System.out.println(sumIntellect/students.size());
	}
	
}
