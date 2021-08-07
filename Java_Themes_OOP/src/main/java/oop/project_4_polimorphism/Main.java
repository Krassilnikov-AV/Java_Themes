/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package oop.project_4_polimorphism;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Swim human = new Human("Антон", 6);
		Swim fish = new Fish("кит");
		Swim boat = new UBoat(25);

		List<Swim> swimmers = Arrays.asList(human, fish, boat);
		for (Swim s : swimmers) {
			s.swim();
		}
	}
}