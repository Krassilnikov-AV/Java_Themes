/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package oop.project_4_polimorphism;

/**
 * Класс UBoat
 */
public class UBoat implements Swim {
	private int speed;

	public UBoat(int speed) {
		this.speed = speed;
	}

	@Override
	public void swim() {
		System.out.println("Подводная лодка плывет, вращая винты, со скоростью " + speed + " узлов.");
	}
}