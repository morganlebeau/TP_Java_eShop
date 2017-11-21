package com.mlebeau.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mlebeau.spring.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product> findByName(String name);
}
