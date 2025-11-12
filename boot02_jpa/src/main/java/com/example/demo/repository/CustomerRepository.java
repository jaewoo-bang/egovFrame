package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {
	List<Customer>findByName(String name);
	List<Customer>findByNameLike(String name);
	//이메일조회
	List<Customer>findByEmailContaining(String email);
	@Query(value = "select * from customer where phone = :phone or name = :name", nativeQuery = true)
	List<Object[]> findAllNative(@Param("phone")String phone, @Param("name") String name);
	
	@Query(value = "select * from customer where phone = :phone or name = :name", nativeQuery = true)
	List<CustomerNative> findAllNativeVO(@Param("phone")String phone, @Param("name") String name);
	
	//JPQL
	@Query("select c from Customer c order by id DESC")
	List<Customer> findAllQuery();
}
