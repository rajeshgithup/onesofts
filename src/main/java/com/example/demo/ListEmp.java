package com.example.demo;

import java.util.List;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListEmp {
	@GetMapping("/getemp/{a}")
	public  List <Employee> get(@RequestBody List <Employee>emps,@PathVariable int a){
		List<Employee>emp=new ArrayList<>();
		for(Employee x:emps) {
			if(x.getSalary()==1000) {
				emp.add(x);
			}
		}
		return emp;
	}
	
}
