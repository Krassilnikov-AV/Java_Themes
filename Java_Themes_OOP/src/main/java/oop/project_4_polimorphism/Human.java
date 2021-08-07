/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package oop.project_4_polimorphism;

/**
 * Класс Human
 */
public class Human implements Swim {
	private String name;
	private int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void swim() {
		System.out.println(toString() + " Я плаваю с помощью надувного круга.");
	}

	@Override
	public String toString() {
		return "Я " + name + ", мне " + age + " лет. ";
	}

}