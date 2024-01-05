package com.student.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.student.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
