package com.brandon.cardatabase.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;


@RepositoryRestResource
public interface CarRepository extends CrudRepository <Car, Long> {


	List<Car> findByBrand(@RequestParam("brand") String brand);
	

	List<Car> findByColor(@RequestParam("color") String color);
}
