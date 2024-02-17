package com.student.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.project.entities.Product;

public interface ProductRespository extends JpaRepository<Product, Long>{

}
