/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package oop.project_3_polymorphism;

/**
 * Класс Cabriolet
 */
public class Cabriolet extends Car {
	public Cabriolet(String model, int maxSpeed, Engine engine, int yearOfManufacture) {
		super(model, maxSpeed, engine, yearOfManufacture);
	}
	@Override
	public void gas() {
		System.out.println("Вы нажали на педаль газа автомобиля типа кабриолет");
		System.out.println("you have pressed the gas pedal of a Cabriolet car");
		System.out.println("------------------------------------------");
	}
}