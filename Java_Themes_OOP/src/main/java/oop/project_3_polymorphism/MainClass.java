/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package oop.project_3_polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// создание экземпляров класса двигатель, для разных авто,
		// которые устанавляваются в автомобиль (типичный пример композиции)
		Engine engineFerrari = new Engine(800);

		Engine engineZil = new Engine(350);
		Car truck = new Truck("Зил", 110, engineZil, 1981);
		truck.gas();

		Car car = new Car();
		System.out.println("Мощность автомобиля составляет: " + car.getEngine()
			+ "л/с \n ----------------------------------------------------------");
		F1Car1 formula1Car = new F1Car1("Ferrari", 320, engineFerrari, 1975);

		formula1Car.gas();
		formula1Car.pitStop();    // если создадим экземпляр класса Car, то данный метод не вызовется!
		Functionality carF1 = formula1Car;
//		formula1Car
		carF1.musicPlay();
		formula1Car.brake();

		CarOwner carOwner = new CarOwner("Александр", 35, truck);
		carOwner.drivingCar();
	}
}