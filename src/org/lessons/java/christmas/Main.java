package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<String> listaDesideri =new ArrayList<>();
		
		//SCANNER
		
		Scanner s = new Scanner(System.in);
		String sceltaUtente;
		System.out.println("Lista Desideri per Natale");
		
		// Chiedere a Utente di inserire desideri
		do {
			System.out.println("Vuoi inserire desiderio? (y)= si / (n) = no ?");
			sceltaUtente = s.nextLine();
			if(sceltaUtente.equals("y")) {
			System.out.print("aggiungi desiderio");
			String desiderio = s.nextLine();
			listaDesideri.add(desiderio);
			}
			System.out.println(listaDesideri.size()+ " ---desideri inseriti");
			if(sceltaUtente.equals("n"));
			System.out.println("I desideri inseriti sono:");
			
			// Array in ordine alfabetico
			
			Collections.sort(listaDesideri);
			
			for(String regali : listaDesideri)
			System.out.println(regali);
			
				;
		}while (!sceltaUtente.equals("n"));
		
		// Chiusura Scanner
		
		s.close();
		
		
		
	
		

	}

}
