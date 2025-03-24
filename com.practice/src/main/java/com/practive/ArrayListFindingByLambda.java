package com.practive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Entity.Employee;

public class ArrayListFindingByLambda {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 0; i < 10; i++) {
			Employee em = new Employee();
			em.setAge(23 + i);
			em.setDepartment("Department" + i);
			em.setName("name" + i);
			em.setSalary(45000 + i);

			empList.add(em);
		}
		
		List <Employee> employeesalaryGreaterThanks45k=empList.stream().filter(em->em.getSalary()>45002).collect(Collectors.toList());
	
	    employeesalaryGreaterThanks45k.stream().forEach(em->System.out.println(em.getName()));

	}

}
