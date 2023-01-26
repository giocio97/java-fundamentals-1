package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		String cognome;
		String colorePreferito;
		int giornoDiNascita;
		int meseDiNascita;
		int annoDiNascita;

		Scanner s = new Scanner(System.in);

		System.out.print("inserisci nome:  ");
		nome = s.nextLine();

		System.out.print("inserisci cognome:  ");
		cognome = s.nextLine();

		System.out.print("inserisci il tuo colore preferito:  ");
		colorePreferito = s.nextLine();

		Scanner input = new Scanner(System.in);

		System.out.print("inserisci il tuo giorno di nascita:  ");
		giornoDiNascita = input.nextInt();

		System.out.print("inserisci il tuo mese di nascita:  ");
		meseDiNascita = input.nextInt();

		System.out.print("inserisci il tuo anno di nascita:  ");
		annoDiNascita = input.nextInt();

		s.close();
		input.close();

		int somma = (giornoDiNascita + meseDiNascita + annoDiNascita);
		System.out.println("nome:  " + nome);
		System.out.println("cognome: " + cognome);
		System.out.println("il tuo colore preferito : " + colorePreferito);
		System.out.println("giorno di nascita : " + giornoDiNascita);
		System.out.println("mese di nascita : " + meseDiNascita);
		System.out.println("anno di nascita : " + annoDiNascita);
		System.out.println("la tua password è  - : " + nome + "-" + cognome + "-" + colorePreferito + "-" + somma);
		

	}

}
