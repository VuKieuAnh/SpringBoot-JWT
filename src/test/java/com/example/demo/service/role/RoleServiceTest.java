package com.example.demo.service.role;

import com.example.demo.model.Role;
import com.example.demo.repo.IRoleRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

class RoleServiceTest {

    private IRoleRepository roleRepository = Mockito.mock(IRoleRepository.class);
    private IRoleService roleService = new RoleService(roleRepository);

//    trc moi lan chay test: goi la phuong thuc
    @BeforeEach
    void init(){
        Role role = new Role();
        role.setId(1L);
        role.setName("ROLE_ADMIN");
        doReturn(Optional.of(role)).when(roleRepository).findById(1L);

        List<Role> roleList = Arrays.asList(role);
        doReturn(roleList).when(roleRepository).findAll();
    }

    @Test
    @DisplayName("findAll can return list is 1 item")
    public void whenFindAllHas1Item() {
        List<Role> roles = (List<Role>) roleService.getAllRoles();
        assertEquals(roles.size(), 1);
    }

    @Test
    @DisplayName("findAll can return list is 1 item")
    public void whenFindAllHas1Item() {
        List<Role> roles = (List<Role>) roleService.getAllRoles();
        assertEquals(roles.size(), 1);
    }



//    du lieu dau vao la gi
//    du lieu tra ve la gi
//    nhung truong hop co the xay ra

}