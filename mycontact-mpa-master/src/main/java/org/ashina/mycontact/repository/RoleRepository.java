package org.ashina.mycontact.repository;

import org.ashina.mycontact.entity.Role;
import org.springframework.data.repository.CrudRepository;



public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}