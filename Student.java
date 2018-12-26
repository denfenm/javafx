package application;

import java.util.ArrayList;

public class Student {
String date;
String name;
String gender;
ArrayList<String> Technologies;
String education;
String location;

public Student(String date, String name, ArrayList<String> Technologies, String gender) {
	this.date = date;
	this.name = name;
	this.Technologies = Technologies;
	this.gender = gender;
}

public Student(String date, String name, String gender, ArrayList<String> Technologies, String education, String location)
{
	//System.out.println("dddd");
	this.date = date;
	this.name = name;
	this.gender = gender;
	this.Technologies = Technologies;
	this.education = education;
	this.location = location;
}

public String toString() {
	return name + " " + gender + " " + Technologies + " " + education + " " + location;
}
}
