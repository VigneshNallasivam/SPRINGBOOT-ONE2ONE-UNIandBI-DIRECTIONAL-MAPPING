package com.spring.basics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.basics.model.ShopKeeperOne2One;

public interface One2OneRepository extends JpaRepository<ShopKeeperOne2One,Integer>
{
	

}
