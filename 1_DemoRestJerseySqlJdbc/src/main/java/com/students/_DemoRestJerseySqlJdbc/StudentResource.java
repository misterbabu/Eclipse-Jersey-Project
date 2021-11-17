package com.students._DemoRestJerseySqlJdbc;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Students createStusent(Students s1)
	{
		repo.create(s1);
		return s1;
	}
	
	@PUT
	@Path("student")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Students updateStudent(Students s1)
	{
		if(repo.getStudent(s1.getId()).getId()==0)
		{
			repo.create(s1);
		}
		else
		{
		repo.update(s1);
		}
		return s1;
	}
	
	@DELETE
	@Path("student/{id}")
	public Students deleteStudent(@PathParam("id") int id)
	{
		Students s = repo.getStudent(id);
		if(s.getId()!=0)
			repo.delete(id);
		return s;
	}

}
