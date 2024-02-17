package com.student.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.project.entities.OrderItem;

public interface OrderItemRespository extends JpaRepository<OrderItem, Long>{

}
