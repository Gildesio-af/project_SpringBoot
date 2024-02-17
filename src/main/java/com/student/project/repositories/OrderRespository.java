package com.student.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.project.entities.Order;

public interface OrderRespository extends JpaRepository<Order, Long>{

}
