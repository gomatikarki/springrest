package com.myapp.controller;

public class Movie {
	private String language;
	private String name;
	private int rating;
	
	public Movie(){
		
	}
	public Movie(String language, String name, int rating){
		this.language = language;
		this.name = name;
		this.rating = rating;
		
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
