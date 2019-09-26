package com.brandon.cardatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brandon.cardatabase.domain.Car;
import com.brandon.cardatabase.domain.CarRepository;

@RestController
public class CarController {
	
	@Autowired
	private CarRepository crepository;
	
	@RequestMapping("/cars")
	public Iterable<Car> getCars(){
		return crepository.findAll();
		
	}

}
