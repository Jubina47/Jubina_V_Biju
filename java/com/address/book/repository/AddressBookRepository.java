package com.address.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.address.book.model.AddressBook;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBook,Integer>{

}
