package com.yashpatel.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashpatel.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
