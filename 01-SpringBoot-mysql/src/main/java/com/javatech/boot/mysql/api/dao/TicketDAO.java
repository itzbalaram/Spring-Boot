package com.javatech.boot.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatech.boot.mysql.api.model.Ticket;

public interface TicketDAO extends CrudRepository<Ticket, Integer>{

}
