package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Client;

public interface IClient extends JpaRepository<Client, Long>{

}
