package com.joaogodoi.SpringBootWithJPA.repositories;

import com.joaogodoi.SpringBootWithJPA.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
