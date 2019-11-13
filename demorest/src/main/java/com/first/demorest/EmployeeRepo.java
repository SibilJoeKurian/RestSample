package com.first.demorest;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {
	List<Employee> empDatabase;

	public EmployeeRepo() {
		empDatabase = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("A");
		e1.setPay(10000);
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("B");
		e2.setPay(200);
		empDatabase.add(e1);
		empDatabase.add(e2);
	}

	public List<Employee> getEmployeelist() {
		return empDatabase;
	}

	public Employee createEmployee(Employee e) {
		empDatabase.add(e);

		return e;
	}

	public Employee searchEmployee(int id) {
		for(Employee e:empDatabase) {
			if(e.getId()==id)
				return e;
		}
		return null;
	}
}
