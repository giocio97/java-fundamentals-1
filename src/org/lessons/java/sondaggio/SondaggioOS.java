package org.lessons.java.sondaggio;

import java.util.Scanner;

public class SondaggioOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String OS;

		Scanner in = new Scanner(System.in);

		System.out.print("quanti studenti usano windows:  ");
		int windowsUser = in.nextInt();

		System.out.print("quanti studenti usano linux:  ");
		int linuxUser = in.nextInt();

		System.out.print("quanti studenti usano macos:  ");
		int macOsUser = in.nextInt();

		int totale = windowsUser + linuxUser + macOsUser;

		double percentualeWindows = (windowsUser / (double) totale) * 100;
		double percentualeLinux = (linuxUser / (double) totale) * 100;
		double percentualeMac = (macOsUser / (double) totale) * 100;

		System.out.println("percentuale studenti windows:3 " + percentualeWindows + "%");
		System.out.println("percentuale studenti linux: " + percentualeLinux + "%");
		System.out.println("percentuale studenti macOS: " + percentualeMac + "%");
		in.close();

	}

}
