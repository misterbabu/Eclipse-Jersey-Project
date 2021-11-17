package com.students._DemoRestJerseyMokeRepository;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	StudentRepository repo = new StudentRepository();
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Students> getStudents()
	{
		return repo.getStudents();
	}
	
	@GET
	@Path("student/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Students getStudent(@PathParam("id") int id)
	{
		return repo.getStudent(id);
	}
	
	
	@POST
	@Path("student")
	public Students createStusent(Students s1)
	{
		System.out.println(s1);
		repo.create(s1);
		return s1;
	}
	

}
