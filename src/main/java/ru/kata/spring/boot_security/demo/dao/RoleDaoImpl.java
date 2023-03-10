package ru.kata.spring.boot_security.demo.dao;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    // Убрал ненужныйе методы и оптимизировал оставшиеся согластно замечаний
    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("SELECT r FROM Role r", Role.class).getResultList();

    }
    @Override
    public Role getRoleByName(String name) {
        return entityManager.createQuery(
                "SELECT r from Role r where r.role=:role", Role.class)
                .setParameter("role", name).getSingleResult();
    }
}
