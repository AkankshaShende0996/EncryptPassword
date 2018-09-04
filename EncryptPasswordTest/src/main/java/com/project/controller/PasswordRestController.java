package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.CustomerBean;
import com.project.exception.EncryptException;
import com.project.service.IPasswordService;

@RestController
public class PasswordRestController {
@Autowired
private IPasswordService service;
	
/*@RequestMapping(value="/encryptPassword",method=RequestMethod.POST)
public String encryptPass(@RequestBody String password)
{
	return service.encryptPassword(password);
	
}*/

@RequestMapping(value="/customerPassEncrypt",method=RequestMethod.GET)
public CustomerBean changeCustomerPassword(String email,String password) throws EncryptException
{

	return service.loggedIn(email, password);
	
}
}
