package com.backend.repo;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.backend.entity.Product;


@CrossOrigin("http://localhost:4200")

public interface ProductRepository extends JpaRepository<Product, Long> {

}
