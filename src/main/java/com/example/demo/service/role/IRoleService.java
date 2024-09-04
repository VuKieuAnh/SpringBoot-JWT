package com.example.demo.service.role;

import com.example.demo.model.DTO.GetNumberOfRole;
import com.example.demo.model.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleService {
    Iterable<GetNumberOfRole> getAllNumberOfRole();
    Role findByName(String name);
    Iterable<Role> getAllRoles();
    Optional<Role> findById(Long id);

}
