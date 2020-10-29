/*
Properties
	• Creational design pattern
	• Used when we have multiple sub-classes of a Super class and based on input, we want to return one class instance.
	• Provides abstraction between implementation and client classes
	• Remove the instantiation of client classes from client code
	
	
Implementation
	• Super class can be interface or abstract class or basic class
	• Factory class has a static method which returns the instance of sub-class based on input
*/

class Main {
  public static void main(String[] args) {
    Vehicle car = VehicleFactory.getInstance("Car", 4);
    System.out.println(car);

    Vehicle bike = VehicleFactory.getInstance("Bike", 2);
    System.out.println(bike);
  }
}