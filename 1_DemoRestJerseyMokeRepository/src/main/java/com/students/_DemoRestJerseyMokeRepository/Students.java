package com.students._DemoRestJerseyMokeRepository;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Students {
	private int id;
	private String sname;
	private int smarks;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	
	
	

}
