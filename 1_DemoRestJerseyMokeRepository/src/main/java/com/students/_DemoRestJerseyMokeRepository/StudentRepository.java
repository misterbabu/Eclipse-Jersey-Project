package com.students._DemoRestJerseyMokeRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	List<Students> students;
	public StudentRepository()
	{
		students = new ArrayList<>();
		Students s = new Students();
		s.setId(101);
		s.setSname("Sayam");
		s.setSmarks(60);
		
		Students s1 = new Students();
		s1.setId(102);
		s1.setSname("Deepak");
		s1.setSmarks(50);
		
		students.add(s);
		students.add(s1);
	}
	public List<Students> getStudents()
	{
		return students;
	}
	public Students getStudent(int id)
	{
		for(Students a: students)
		{
			if(a.getId()==id)
				return a;
		}
		return new Students();
	}
	public void create(Students s1) {
		students.add(s1);
		
	}

}
