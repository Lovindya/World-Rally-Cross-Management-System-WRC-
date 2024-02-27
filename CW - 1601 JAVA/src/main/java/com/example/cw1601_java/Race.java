package com.example.cw1601_java;

import java.time.LocalDate;

public class Race {
	private String name;
	private int position;
	private int CP;
	private LocalDate date;
	private String location;



	public Race(String name, int position, int CP, String location,LocalDate date) {
		this.name = name;
		this.position = position;
		this.CP = CP;
		this.location = location;
		this.date = date;

	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getPosition() {return position;}
	public void setPosition(int position) {this.position = position;}
	public int getCP() {return CP;}
	public void setCP(int CP) {this.CP = CP;}
	public String getLocation() {return location;}
	public void setLocation(String location) {this.location = location;}
	public LocalDate getDate() {return date;}
	public void setDate(LocalDate date) {this.date = date;}


}