package database;

public class Project {

	String name;
	String city;
	int year;
	
	public Project(String name, String city, int year){ this.name = name;
	this.city = city;
	this.year = year;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString(){
		return "City: " + city + " Name: " + name + " Year: " + year;
	}
}
