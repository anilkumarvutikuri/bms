package com.read.bms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.read.bms.dtos.ShowDTO;
import com.read.bms.entities.Show;
import com.read.bms.service.ReadService;

@RestController
public class ReadController {

	@Autowired
	ReadService readService;

	
	@PostMapping("/getMovies")
	public Iterable<Show> getShows(@RequestBody ShowDTO showdto) {
		return readService.getShows(showdto);

	}
	
	@PostMapping("/save")
	public Show saveShows(@RequestBody Show show) {
		return readService.saveShow(show);

	}
	
	
	
	

}
