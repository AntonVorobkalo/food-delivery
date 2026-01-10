package com.fooddelivery.userService.repository;

import com.fooddelivery.userService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
