package com.project.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JSPController {
	
	@RequestMapping(value="/login")
	public String loginPage() {
		return "login";
	}
/*	@RequestMapping(value="/encryptionConfirm")
	public String confirm() {
		return "encryptionConfirm";
	}*/
}
