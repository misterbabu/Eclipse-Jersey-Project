package com.students._DemoRestJerseySqlJdbc;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class StudentRepository {
	Connection con = null;
	
	public StudentRepository()
	{
		String url = "jdbc:mysql://localhost:3306/student_db";
		String username = "misterbabu";
		String password = "password";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public List<Students> getStudents()
	{
		List<Students> students = new ArrayList<>();
		String sql = "select * from student";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				Students s = new Students();
				s.setId(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setSmarks(rs.getInt(3));
				students.add(s);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return students;
	}
	public Students getStudent(int id)
	{
		Students s = new Students();
		String sql = "select * from student where id ="+id;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				s.setId(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setSmarks(rs.getInt(3));
			
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return s;
	}
	public void create(Students s1) {
		String sql = "insert into student values(?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1,s1.getId());
			st.setString(2, s1.getSname());
			st.setInt(3, s1.getSmarks());
			st.executeUpdate();
			}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void update(Students s1) {
		String sql = "update student set sname=?,smarks=? where id=?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, s1.getSname());
			st.setInt(2, s1.getSmarks());
			st.setInt(3,s1.getId());
			st.executeUpdate();
			}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void delete(int id) {
		String sql = "delete from student where id=?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1,id);
			st.executeUpdate();
			}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}		
}
