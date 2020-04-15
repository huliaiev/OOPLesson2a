package com.gmail.ahuliaiev;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat(6, 8, true, "milk", "Vaska", "homecat");

		System.out.println(cat1.getAge());
		System.out.println(cat1.hashCode());
		
		cat1.getVoice();
		
		System.out.println(cat1);
	}

}
