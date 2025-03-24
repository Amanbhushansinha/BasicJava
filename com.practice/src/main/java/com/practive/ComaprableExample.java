package com.practive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Entity.Employee;

public class ComaprableExample{
	
	public static void main(String[] args) {
		List<Employee> emlist = new ArrayList<Employee>();
		for (int i =0 ;i <10; i++) {
			Employee employee = new Employee();
			employee.setAge(i-10);
			employee.setDepartment("Department"+i);
			employee.setName("name"+i);
			employee.setSalary(45000+i);
			emlist.add(employee);
		}
		Collections.sort(emlist);
		for (Iterator iterator = emlist.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.getAge());
			
		}
		
	}

	

	

}
