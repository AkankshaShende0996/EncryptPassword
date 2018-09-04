 package com.project.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.bean.CustomerBean;
import com.project.exception.EncryptException;
import com.project.repo.IPassworsRepository;

@Service
public class PasswordServiceImpl implements IPasswordService{
@Autowired
private IPassworsRepository repo;


	@Override
	@Transactional
	public String encryptPassword(String password) {
		StringBuilder sb=new StringBuilder(password);
		sb.reverse().append(password);     /*.append("$!").insert(0,"!$")*/
		System.out.println(sb);
		String encrytedPass=sb.toString();
		
		
/*		 String reverse = "";
	        
	        
	        for(int i = password.length() - 1; i >= 0; i--)
	        {
	        	reverse = reverse + password.charAt(i);
	        }
	      String encrytedPass ="!$" +reverse+"$!";*/

		return encrytedPass;
		
		

	}


	@Override
	public CustomerBean loggedIn(String email, String password) throws EncryptException {
		CustomerBean customer=repo.searchCustomerByEmail(email);

		System.out.println(customer);
		String encrypt=encryptPassword(password);
		System.out.println(encrypt);
		if(customer.getPassword().matches(encrypt))	
		return customer;
		else
			throw new EncryptException("Incorrect Password");

	}

}
