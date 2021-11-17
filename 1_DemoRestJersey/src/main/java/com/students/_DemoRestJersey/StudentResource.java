package com.students._DemoRestJersey;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("stu")
public class StudentResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	/*public Students getStudent()
	{
		System.out.println("Called--");
		Students s = new Students();          for return single object
		s.setSname("Reddy");
		s.setSmarks(70);
		
		
		
		return s;
	}*/
	
	//for returning multiple objects we need to create list
	
	public List<Students> getStudents()
	{
		Students s = new Students();
		s.setSname("Sayam");
		s.setSmarks(60);
		
		Students s1 = new Students();
		s1.setSname("Deepak");
		s1.setSmarks(50);
		
		List<Students> students = Arrays.asList(s,s1);
		
		return students;
	}

}
