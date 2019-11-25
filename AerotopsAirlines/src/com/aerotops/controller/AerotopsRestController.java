package com.aerotops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aerotops.model.Airports;
import com.aerotops.service.AerotopsService;

@RestController
@RequestMapping(path="data")
public class AerotopsRestController {
	
	@Autowired
	private AerotopsService service;
	
	// http://localhost:9000/AerotopsAirlines/data
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Airports> viewAllAirports()
	{
		List<Airports> list = service.findAllAirports();
		return list;
	}
	@ExceptionHandler({Exception.class})
	public String handleException()
	{
		return "Error";
	}
}
