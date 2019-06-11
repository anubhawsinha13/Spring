package com.a3.backend.repository.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a3.backend.repository.employee.dao.CustomerChurnRepository;
import com.a3.backend.repository.employee.model.Churn;

@RestController
@RequestMapping("/api/v1")
public class ChurnController {
	
	private CustomerChurnRepository churnRepository;
	
	@GetMapping("/")
	public List<Churn> getAllChurn(){
		return churnRepository.findAll();
	}

}
