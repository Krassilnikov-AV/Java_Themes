/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package oop.project_4_polimorphism.dance;

/**
 * Класс BreakDankDancer
 */
public class BreakDankDancer extends Dancer {
	public BreakDankDancer(String name, int age) {
		super(name, age);
	}
	// переопределение метода базового класса
	@Override
	public void dance(){
		System.out.println(toString() + "Я танцую брейк-данс!");
	}
}