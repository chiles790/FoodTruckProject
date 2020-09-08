package com.skilldistillery.foodproject;

public class FoodTruck {
	
	private String truck;
	private String food;
	private int rating;
	
	
	
	  public String getTruck() {
		return truck;
	}



	public void setTruck(String truck) {
		this.truck = truck;
	}



	public String getFood() {
		return food;
	}



	public void setFood(String food) {
		this.food = food;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public String toString() {
		    String output =  truck;
		    return output;
		  }

	 public void Truck() {
		    String truckData = this.toString();
		    System.out.println(truckData);
		  }
	 public String toString1() {
		 String output = food;
		 return output;
	 }
	 public void Food() {
		 	String foodData = this.toString1();
		 	System.out.println(foodData);
	 }
	 public int toInt() {
		 int output = rating;
		 return output;
	 }
	 public void Rating() {
		 int ratingData = this.toInt();
		 System.out.println(ratingData);
	 }
}
