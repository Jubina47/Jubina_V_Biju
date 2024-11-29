package com.address.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.book.model.AddressBook;
import com.address.book.repository.AddressBookRepository;

@Service
public class AddressBookService {
	
	@Autowired
	public AddressBookRepository addressbookRepo;
	
	public List<AddressBook> getAllAddressBookInfo(){
		return addressbookRepo.findAll();
	}
	public AddressBook saveAddressBookInfo(AddressBook address) {
		return addressbookRepo.save(address);
	}
	

}
