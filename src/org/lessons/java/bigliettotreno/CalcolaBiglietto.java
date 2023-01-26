package org.lessons.java.bigliettotreno;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int kilometriUser;
		int etaUser;
		float prezzo = 0.21f;

		System.out.print("Quanti chilometri vuoi percorrere?");
		kilometriUser = s.nextInt();

		System.out.print("Quanti anni hai?");
		etaUser = s.nextInt();

		if (etaUser < 18)
			System.out.println((prezzo * 80 / 100) * kilometriUser + " € ");
		else if (etaUser > 65)
			System.out.println((prezzo * 60 / 100) * kilometriUser + " € ");
		else
			System.out.println(prezzo * kilometriUser + " € ");

		s.close();

	}

}
