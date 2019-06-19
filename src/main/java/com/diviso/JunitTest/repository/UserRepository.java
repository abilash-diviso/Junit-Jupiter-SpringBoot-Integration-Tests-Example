package com.diviso.JunitTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diviso.JunitTest.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
