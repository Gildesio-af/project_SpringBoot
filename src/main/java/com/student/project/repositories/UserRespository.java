package com.student.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.project.entities.User;

public interface UserRespository extends JpaRepository<User, Long>{

}
