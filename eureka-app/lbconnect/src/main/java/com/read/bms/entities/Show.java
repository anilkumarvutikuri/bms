package com.read.bms.entities;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shows")
public class Show {

	@Id  @GeneratedValue(strategy=GenerationType.AUTO)
	private int showId;
	
	public Show() {
		super();
	}
	@Column  
	private int theatreId;

	@Column
	private String movie;

	@Column
	private LocalDateTime movieTime;

	@Column
	private String theatreName;

	@Column
	private String city;
	
	@Column
	private String available;
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
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
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", theatreId=" + theatreId + ", movie=" + movie + ", movieTime=" + movieTime
				+ ", theatreName=" + theatreName + ", city=" + city + ", available=" + available + "]";
	}
	public Show(int showId, int theatreId, String movie, LocalDateTime movieTime, String theatreName, String city,
			String available) {
		super();
		this.showId = showId;
		this.theatreId = theatreId;
		this.movie = movie;
		this.movieTime = movieTime;
		this.theatreName = theatreName;
		this.city = city;
		this.available = available;
	}
	

}
