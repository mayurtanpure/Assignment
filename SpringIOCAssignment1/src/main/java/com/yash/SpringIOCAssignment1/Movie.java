package com.yash.SpringIOCAssignment1;

import java.util.List;

public class Movie {
	
	private List<String> movieName;
	
	private List<String> time;

	public List<String> getMovieName() {
		return movieName;
	}

	public void setMovieName(List<String> movieName) {
		this.movieName = movieName;
	}

	public List<String> getTime() {
		return time;
	}

	public void setTime(List<String> time) {
		this.time = time;
	}

	public Movie(List<String> movieName, List<String> time) {
		super();
		this.movieName = movieName;
		this.time = time;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", time=" + time + "]";
	}

	
	
	
	

}
