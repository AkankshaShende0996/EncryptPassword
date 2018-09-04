package com.project.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.project.beans.CustomerBean;


@RestController
public class FrontController {
	
	@RequestMapping("/encryptionConfirm")
	public ModelMap logIn(String email,String pass,ModelMap map) {
	
		RestTemplate restTemplate=new RestTemplate();
		CustomerBean customer=restTemplate.getForObject("http://localhost:8798/customerPassEncrypt?email="+email+"&password="+pass, CustomerBean.class);
		System.out.println(customer);
		map.put("customer",customer);
	    return map;
	}
	/*@RequestParam(value="pass")*/

}
