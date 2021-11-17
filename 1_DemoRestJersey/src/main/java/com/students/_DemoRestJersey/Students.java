package com.students._DemoRestJersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Students {
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
	
	

}
