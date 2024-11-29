package com.address.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.address.book.model.AddressBook;
import com.address.book.service.AddressBookService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class AddressBookController {
	
	@Autowired
	public AddressBookService addressbookService;
	
	@GetMapping("/api/addressbook")
	public List<AddressBook> showAllEmployee(){
		return addressbookService.getAllAddressBookInfo();
	}
	@PostMapping("/api/addressbook")
	public AddressBook addEmployee(@RequestBody AddressBook address){
		return addressbookService.saveAddressBookInfo(address);
	}
	

}
