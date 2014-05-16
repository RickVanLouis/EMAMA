package com.example.aufgabe_5;


public class NewsItem {

	private String name;
	private String rating;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "[ Name=" + name + ", Rating=" + 
				rating + " , location=" + location + "]";
	}
}
