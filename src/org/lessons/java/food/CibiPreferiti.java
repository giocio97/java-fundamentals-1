package org.lessons.java.food;

import java.util.Scanner;

public class CibiPreferiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String[] cibi = { "Pizza", "Carbonara", "Fiorentina", "sushi", "Parmigina" };

		System.out.println("cibo preferito: " + cibi[cibi.length - 5] + " la lunghezza della classifica è : "
				+ cibi.length + " cibo preferito ma non troppo è " + cibi[cibi.length - 1]

		);

	}

}
