package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.entity.Product;
import com.backend.service.ProductService;

@RestController
@CrossOrigin("http://localhost:4200")
public class ProductController {



@Autowired
ProductService prodserve;

@GetMapping("/products")
//@PostMapping("/products")
public @ResponseBody List<Product> getProducts() {
System.out.println("abcd");
List<Product> list= prodserve.getAllProducts();
System.out.println("controller"+list);
return list;
}



}
