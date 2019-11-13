package com.first.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	int id;
	String name;
	float pay;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPay() {
		return pay;
	}

	public void setPay(float pay) {
		this.pay = pay;
	}

	public String toString(Employee e) {
		return "Name " + e.getName() + " " + e.getPay();

	}
}
