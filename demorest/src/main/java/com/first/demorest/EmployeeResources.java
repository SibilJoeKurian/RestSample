package com.first.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Employee")
public class EmployeeResources {
	EmployeeRepo emp = new EmployeeRepo();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getEmployee() {
		System.out.println("Calling getEmployee");
		return emp.getEmployeelist();

	}

	@POST
	@Path("createEmployee")
	public Employee createEmployee(Employee e) {
		System.out.println(e);
		emp.createEmployee(e);
		System.out.println(e.toString(e));
		return e;

	}

	@GET
	@Path("Employee/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployee(@PathParam("id") int id) {
		return null;

	}
}
