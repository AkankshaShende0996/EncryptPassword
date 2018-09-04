package com.project.service;

import com.project.bean.CustomerBean;
import com.project.exception.EncryptException;


public interface IPasswordService {
public CustomerBean loggedIn(String email,String password) throws EncryptException;

public String encryptPassword(String password);
}
