package com.student.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.project.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long>{

}
