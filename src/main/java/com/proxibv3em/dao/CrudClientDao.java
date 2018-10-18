package com.proxibv3em.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proxibv3em.model.Client;

public interface CrudClientDao extends JpaRepository<Client, Long> {

}
