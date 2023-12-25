package com.vianadaniel.userdep.repositories;

import com.vianadaniel.userdep.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
