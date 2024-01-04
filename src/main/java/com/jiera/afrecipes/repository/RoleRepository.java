package com.jiera.afrecipes.repository;

import java.util.Collection;

import com.jiera.afrecipes.domain.Role;

public interface RoleRepository<T extends Role> {
    // Basic CRUD Operations
    T create(T data);

    Collection<T> list(int page, int pageSize);

    T get(Long id);

    T update(T data);

    Boolean delete(Long id);

    // More complex Operations
    void addRoleToUser(Long userId, String roleName);

    Role getRoleByUserId(Long userId);

    Role getRoleByUserEmail(String email);

    void updateUserRole(Long id, String roleName);
}
