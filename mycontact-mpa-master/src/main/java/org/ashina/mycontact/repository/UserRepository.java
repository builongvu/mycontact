package org.ashina.mycontact.repository;

import org.ashina.mycontact.entity.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmail(String email);

}
