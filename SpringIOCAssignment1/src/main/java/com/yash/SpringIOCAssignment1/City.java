package com.yash.SpringIOCAssignment1;

import java.util.List;

public class City {

	private int id;
	private List<String> cityName;
	private CinemaHall cinemaHall;

	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + ", cinemaHall=" + cinemaHall + "]";
	}

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int id, List<String> cityName, CinemaHall cinemaHall) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.cinemaHall = cinemaHall;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getCityName() {
		return cityName;
	}

	public void setCityName(List<String> cityName) {
		this.cityName = cityName;
	}

	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}

	public void display() {

		for (String s : cityName) {

			System.out.println("City Name: " + s + "\n");
			cinemaHall.display2();

		}

	}

}
