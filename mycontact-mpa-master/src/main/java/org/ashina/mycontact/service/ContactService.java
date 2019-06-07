package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContactService {

    Iterable<Contact> findAll();

    List<Contact> search(String term);

    Contact findOne(Integer id);

    void save(Contact contact);

    void delete(Integer id);
    
    Page<Contact> findPaginated(Pageable pageable);

}
