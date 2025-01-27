package com.piggybank.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piggybank.user.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);

}
