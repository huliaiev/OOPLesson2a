package com.gmail.ahuliaiev;

public class Cat extends Animal {
	private String name;
	private String type;
	
	public Cat(int age, double weigt, boolean sex, String ration, String name, String type) {
		super(age, weigt, sex, ration); //harakterizuet kota kak Animal
		this.name = name;
		this.type = type;
	}
	
	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void getVoice() {
		System.out.println("Myau");
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + super.toString(); //super.toString() tekst iz superklassa
	}
	
}
