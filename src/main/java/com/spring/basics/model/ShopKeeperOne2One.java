package com.spring.basics.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shopkeeper_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopKeeperOne2One 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int shopNo;
	private String shopKeeperName;
	private String shopLocation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_table_customerId")
	private CustomerOne2One customer;
}
