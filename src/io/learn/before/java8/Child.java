package io.learn.before.java8;

import java.util.List;

public class Child {

	@Override
	public String toString() {
		return "Child [id=" + id + ", name=" + name + ", experiance=" + experiance + ", technology=" + technology
				+ ", phonenumbers=" + phonenumbers + "]";
	}

	public int id;  
	public String name;  
    public int experiance;
    public String technology;
    public List<String> phonenumbers;
    
	public Child(int id, String name, int experiance, String technology) {
		super();
		this.id = id;
		this.name = name;
		this.experiance = experiance;
		this.technology = technology;
	}

	public Child(int id, String name, List<String> phonenumbers) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumbers = phonenumbers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public List<String> getPhonenumbers() {
		return phonenumbers;
	}

	public void setPhonenumbers(List<String> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}

	
    
}
