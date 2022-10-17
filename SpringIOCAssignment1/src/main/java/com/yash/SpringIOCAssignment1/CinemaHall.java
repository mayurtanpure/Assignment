package com.yash.SpringIOCAssignment1;

import java.util.List;
import java.util.ListIterator;

public class CinemaHall {

	private List<String> cinemaHallName;
	private Movie movie;

	public List<String> getCinemaHallName() {
		return cinemaHallName;
	}

	public void setCinemaHallName(List<String> cinemaHallName) {
		this.cinemaHallName = cinemaHallName;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public CinemaHall(List<String> cinemaHallName, Movie movie) {
		super();
		this.cinemaHallName = cinemaHallName;
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "CinemaHall [cinemaHallName=" + cinemaHallName + ", movie=" + movie + "]";
	}

	public CinemaHall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void display2() {

		for (String c : cinemaHallName) {

			System.out.println("CinemaHall Name: " + c + " ");

			ListIterator<String> list2 = movie.getMovieName().listIterator();
			ListIterator<String> list3 = movie.getTime().listIterator();

			while (list2.hasNext() && list3.hasNext()) {

				String mv = list2.next();
				String t = list3.next();
				System.out.println("Movie Name: " + mv + ", Time: " + t);
			}

			System.out.println();

		}

	}

}
