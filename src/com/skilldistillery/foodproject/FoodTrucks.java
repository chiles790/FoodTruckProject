package com.skilldistillery.foodproject;
import java.util.Scanner;
public class FoodTrucks {

	public static void main(String[] args) {
		menu();
//		
//		System.out.println(truck1Data + truck2Data + truck3Data + truck4Data + truck5Data);
		
		

		}
	public static void menu() {
		Scanner kb = new Scanner(System.in);
		FoodTruck truck1 = new FoodTruck();
		truck1.setTruck("China King");
		truck1.setFood("lo mein");
		truck1.setRating(10);
		
		FoodTruck truck2 = new FoodTruck();
		truck2.setTruck("Taco Taco");
		truck2.setFood("Tacos");
		truck2.setRating(7);
		
		FoodTruck truck3 = new FoodTruck();
		truck3.setTruck("Steak Shack");
		truck3.setFood("Frisco Melt");
		truck3.setRating(5);
		
		FoodTruck truck4 = new FoodTruck();
		truck4.setTruck("Pizza Hut");
		truck4.setFood("Pizza");
		truck4.setRating(5);
		
		FoodTruck truck5 = new FoodTruck();
		truck5.setTruck("Hibachi");
		truck5.setFood("Sushi");
		truck5.setRating(8);
		
		truck1.Truck();
		truck2.Truck();
		truck3.Truck();
		truck4.Truck();
		truck5.Truck();
		String truck1Data = truck1.toString();
		String truck2Data = truck2.toString();
		String truck3Data = truck3.toString();
		String truck4Data = truck4.toString();
		String truck5Data = truck5.toString();
		
		String food1Data = truck1.toString1();
		String food2Data = truck2.toString1();
		String food3Data = truck3.toString1();
		String food4Data = truck4.toString1();
		String food5Data = truck5.toString1();
		
		int rating1Data = truck1.toInt();
		int rating2Data = truck2.toInt();
		int rating3Data = truck3.toInt();
		int rating4Data = truck4.toInt();
		int rating5Data = truck5.toInt();
		
		System.out.println("*******************");
		System.out.println("* Please Choose:  *");
		System.out.println("*  1: Food Trucks *");
		System.out.println("* 2:Average Rating*");
		System.out.println("* 3:Highest Rated *");
		System.out.println("*  4:   Quit      *");
		System.out.println("*******************");
		int selection = kb.nextInt();
		
		if( selection == 1) {
			System.out.println(truck1Data + truck2Data + truck3Data + truck4Data + truck5Data);
		}
		else if(selection == 2) {
			System.out.println("Average rating is: " + ((rating1Data + rating2Data + rating3Data + rating4Data + rating5Data) / 5));
			
		}
		else if(selection == 3) {
			System.out.println("Highest rated is: " + truck5Data);
		}
		else {
			System.out.println("Have a nice day");
		}
	}
		
	}
//}
