package com.ccamilofierro.usersapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccamilofierro.usersapp.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
        Optional<Role> findByName(String name);
}
