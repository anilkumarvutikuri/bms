package com.read.bms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.read.bms.dtos.ShowDTO;
import com.read.bms.entities.Show;
import com.read.bms.repository.ShowRepository;

@Component
public class ReadService {

	@Autowired
	ShowRepository showRepository;

	RestTemplate restTemplate = new RestTemplate();

	public Iterable<Show> getShows(ShowDTO showdto) {
		return showRepository.findByMovieAndCity(showdto.getMovie(),showdto.getCity());


	}

	public Show saveShow(Show show) {
		return showRepository.save(show);

	}

}
