package com.SuperKeyword.Examples;

public class Hotelmanagement extends Person {
String name = "Prasanna";
	
	 public Hotelmanagement() {
		System.out.println("In defual constructor of Hotelmanagement");
	 }
	 
	 	 public void employe(){
		 this.name=name;
		 System.out.println("manger saying prepare fast");
		
	 }
	 	 
	 @Override
		public void cook(String name) {
			// TODO Auto-generated method stub
			super.cook(name);
		}

	public static void main(String[] args) {
		Hotelmanagement hotel = new Hotelmanagement();
		hotel.cook();
		hotel.employe();
		hotel.cook("Shiva");
		
		
	}
}
