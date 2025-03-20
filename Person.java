package com.SuperKeyword.Examples;

public class Person {
	String name = "Shiva";
	
	public Person() {
		System.out.println("In defual constructor of person");
	}
	
	public void cook() {
		System.out.println("person is cooking food");
	}
	public void cook(String name) {
		this.name=name;
		System.out.println("Shiva is cooking");
	}
			
	

}
