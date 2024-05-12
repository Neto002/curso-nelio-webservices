package com.neto.cursoneliowebservices.repositories;

import com.neto.cursoneliowebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
