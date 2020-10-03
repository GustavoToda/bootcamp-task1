package com.bootcamp.crud.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.crud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
