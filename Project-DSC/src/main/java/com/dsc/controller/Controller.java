package com.dsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsc.bean.DoubleValuedDS;
import com.dsc.service.DoubleValuedInterface;

@RestController
public class Controller {
	
	@Autowired
	private DoubleValuedInterface valuedInterface;
	
	@GetMapping(path = "/{id}", produces="application/json")
	public DoubleValuedDS getDoubleValuedIntegerById(@PathVariable("id") String Id) {
		System.out.println(valuedInterface.findInDatabase(Id).get());
		return valuedInterface.findInDatabase(Id).get();
	}
	@PostMapping(path = "/add", produces="application/json")
	public DoubleValuedDS addInDatabase(@RequestBody DoubleValuedDS ds) {
		return valuedInterface.addInDatabase(ds) ? ds : null;
	}
}
