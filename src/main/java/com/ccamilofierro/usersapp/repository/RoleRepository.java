package com.ccamilofierro.usersapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccamilofierro.usersapp.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
        Optional<Role> findByName(String name);
}
