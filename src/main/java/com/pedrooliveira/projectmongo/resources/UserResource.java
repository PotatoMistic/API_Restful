package com.pedrooliveira.projectmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pedrooliveira.projectmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		
		User pedro = new User("1", "Pedro Oliveira", "pedro@gmail.com");
		User jorge = new User("2", "Jorge Oliveira", "jorge@gmail.com");

		List<User> list = new ArrayList<>();

		list.addAll(Arrays.asList(pedro, jorge));

		return ResponseEntity.ok().body(list);
	}
}
