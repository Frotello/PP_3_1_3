package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.RoleDao;
import ru.kata.spring.boot_security.demo.model.Role;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class RoleServiceImpl implements  RoleService{
    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Set<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }

    @Override
    @Transactional
    public Set<Role> getSetOfRoles(String[] roleNames) {
        Set<Role> roles = new HashSet<>();
        for (String roleName : roleNames) {
            Role role = roleDao.getRoleByName(roleName);
            if (role != null) {
                roles.add(role);
            }
        }
        return roles;
    }

    @Override
    @Transactional
    public void addRole(Role role) {
        roleDao.add(role);
    }

    @Override
    @Transactional
    public void editRole(Role role) {
        roleDao.edit(role);
    }

    @Override
    public Role getRoleById(Long id) {
        return roleDao.getById(id);
    }
}
