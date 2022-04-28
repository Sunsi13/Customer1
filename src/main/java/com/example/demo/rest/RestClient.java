package com.example.demo.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.repo.IClient;
@RestController
public class RestClient {

	@Autowired
	IClient crepo;
	@PostMapping(path = "/clients")
	public Client add(@RequestBody Client c)
	{
		return crepo.save(c);
	}
	@GetMapping(path = "/client/{id}")
	public Client findc(@PathVariable long id)
	{
		Optional<Client> c = crepo.findById(id);
		if(c.isPresent())
			return c.get();
		else
			return null;
	}
}
