package com.ut0p1c.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ut0p1c.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
