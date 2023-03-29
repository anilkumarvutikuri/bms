package com.read.bms.dtos;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class ShowDTO {

	private String movie;


	private LocalDateTime movieTime;


	private String city;
	
	public ShowDTO() {
		super();
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public LocalDateTime getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(LocalDateTime movieTime) {
		this.movieTime = movieTime;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ShowDTO(String movie, LocalDateTime movieTime, String city) {
		super();
		this.movie = movie;
		this.movieTime = movieTime;
		this.city = city;
	}


}
