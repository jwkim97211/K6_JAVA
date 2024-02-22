package com.ruby.java.ch08;

interface Vehicle {
	public abstract void showVehicle();
}

class Truck implements Vehicle {
	int weight;

	public Truck(int weight) {
		this.weight = weight;
	}

	public void showVehicle() {
		System.out.println("Truck: weight=" + weight);
	}
}

class Car implements Vehicle {
	int vehicleOccupants;

	public Car(int vehicleOccupants) {
		this.vehicleOccupants = vehicleOccupants;
	}

	public void showVehicle() {
		System.out.println("Car: vehicleOccupants=" + vehicleOccupants);
	}
}

class Taxi extends Car {
	int mileage;

	public Taxi(int vehicleOccupants, int mileage) {
		super(vehicleOccupants); // this.vehicleOccupants=vehicleOccupants;
		this.mileage = mileage;
	}

	public void showVehicle() {
		super.showVehicle(); // System.out.println("Car: vehicleOccupants="+vehicleOccupants);
		System.out.println("Taxi: mileage=" + mileage);
	}
}

class MotorCycle implements Vehicle {
	int price;

	public MotorCycle(int price) {
		this.price = price;
	}

	public void showVehicle() {
		System.out.println("MotorCycle: price=" + price);
	}
}

public class Test_인터페이스다형성실습 {
	public static void displayVehicles(Vehicle[] a) {
		for (Vehicle v : a) {
			v.showVehicle();
		}
	}

	public static void main(String[] args) {
		Vehicle[] arr = new Vehicle[5]; // 배열을 만듬
		arr[0] = new Truck(33);
		arr[1] = new Car(4);
		arr[2] = new Taxi(2, 9000);
		arr[3] = new Truck(22);
		arr[4] = new MotorCycle(12000);
		displayVehicles(arr);
	}
}
