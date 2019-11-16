package com.ursa.radium.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ursa.radium.model.EntityBean;

@RestController
@RequestMapping("/entity/")
public class EntityController {
	
	
	
	@PostMapping("/saveEntity")
	@CrossOrigin(origins="*")
	public boolean saveEntity(@RequestBody EntityBean entityBean){
		return true;
	}

}
