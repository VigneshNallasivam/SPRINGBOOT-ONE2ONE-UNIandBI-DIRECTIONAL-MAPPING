package com.spring.basics.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOne2One 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private String productName;
	private long price;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ShopKeeperOne2One shopkeeper;
}
