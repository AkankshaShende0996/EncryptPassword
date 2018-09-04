package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.project.bean.CustomerBean;

@Repository
public interface IPassworsRepository extends JpaRepository<CustomerBean, String>{
	@Query("select p from CustomerBean p where p.email=(:customerEmail)")
	public CustomerBean searchCustomerByEmail(@Param(value = "customerEmail") String  email);
}
