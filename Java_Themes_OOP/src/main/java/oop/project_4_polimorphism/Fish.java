/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package oop.project_4_polimorphism;

/**
 * Класс Fish
 */
public class Fish implements Swim {
	private String name;

	public Fish(String name) {
		this.name = name;
	}

	@Override
	public void swim() {
		System.out.println("Я рыба " + name + ". Я плыву, двигая плавниками.");

	}
}