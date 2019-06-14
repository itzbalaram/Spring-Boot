package com.javatech.boot.mysql.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Ticket")
@Data
public class Ticket {

	@Id
	@GeneratedValue
	private int id;
	private double amount;
	private String catagory;
}
