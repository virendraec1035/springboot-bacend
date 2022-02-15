package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.entity.Product;
import com.backend.repo.ProductRepository;



@Service          // Service annotation used to indicate that a class belongs to that layer
public class ProductService {
	
@Autowired	      // Autowired annotation   can be use autowire bean on setter
	ProductRepository productRepo;
	public List<Product> getAllProducts() {
		
        List <Product> list = productRepo.findAll();
        System.out.println(list);
        return list;
    }

}
