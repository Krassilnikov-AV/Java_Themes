/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package core.Interface_AbstractClass.abstractClasses;


/**
 * Класс ShapeAbstract
 */
public abstract class ShapeAbstract {
	private String color;

	public ShapeAbstract(String color) {
		this.color = color;
	}

	public abstract String getName();

	public abstract double getSquare();

	public String getColor(){
		return color;
	}

}