package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Runner;

public interface RunnerRepo extends CrudRepository<Runner, Integer> {
	
	

}
