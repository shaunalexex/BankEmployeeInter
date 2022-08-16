package com.example.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Employee;
import com.example.repository.EmployeeRepo;
import com.example.service.EmployeeService;




@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Object getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee e = employeeRepo.findById(id).orElse(null);
		Map<String,Object> map = new HashMap<>();
		if (e!=null)
		{
			map.put("empID",e.getUser_id());
			map.put("empPass",e.getPassword());
		}
		System.out.println(map);
		return map;
	}
}
	
	