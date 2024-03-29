package com.example.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Result;



public interface ResultRepo extends CrudRepository<Result, Integer>{
	
	ArrayList<Result> selectAll(int id_mar);
	ArrayList<Result> SelectByRunnerId(int id_r);
	Result findByID_reg(int id);
	

}
