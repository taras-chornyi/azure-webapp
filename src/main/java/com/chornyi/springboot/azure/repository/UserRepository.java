package com.chornyi.springboot.azure.repository;

import com.chornyi.springboot.azure.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
