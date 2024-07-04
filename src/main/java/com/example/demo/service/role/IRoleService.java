package com.example.demo.service.role;

import com.example.demo.model.DTO.GetNumberOfRole;
import com.example.demo.model.Role;

public interface IRoleService {
    Iterable<GetNumberOfRole> getAllNumberOfRole();
    Role findByName(String name);

}
