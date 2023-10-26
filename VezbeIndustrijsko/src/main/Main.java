package main;

import java.util.Scanner;

import geometry.Point;

public class Main {
	

	public static void main(String[] args) {
		
//		int brojJedan = 1; //default 0
//		double decimalniBroj = 1.5; // default 0.0
//		boolean check = true; // default false
//		char a = 'a';
//		String abc = "abc"; // default "" 
		
		
		//ZADATAK ZA VEZBU
//		System.out.println("Unesite aritemticku operaciju"
//				+ "koju zelite da izvrsite");
//		Scanner scanner = new Scanner(System.in);
//		char operacija = scanner.next().charAt(0);
		
		//PETLJE
		
		//FOR PETLJA
//		for(int brojac = 1; brojac <=10; brojac++) {
//			System.out.println(brojac);
//		}
		
		//WHILE PETLJA
//		int brojac = 1;
//		while(brojac <= 10) {
//			System.out.println(brojac);
//			brojac++;
//		}
		
		//DO WHILE PETLJA
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <=10);
		
		//ZADATAK 1 - Sabiranje parnih brojeva
//		System.out.println("Unesite zeljenu vrednost");
//		Scanner scanner = new Scanner(System.in);
//		int korisnickiBroj = scanner.nextInt();
//		
//		int sumaParnihBrojeva = 0;
//		if(korisnickiBroj < 200) {
//			for(;korisnickiBroj > 0; korisnickiBroj = korisnickiBroj - 2) {
//				//neparan broj
//				if(!(korisnickiBroj%2 == 0)) {
//					korisnickiBroj--;
//				}
//				sumaParnihBrojeva += korisnickiBroj;
//				//sumaParnihBrojeva = sumaKorisnickihBrojeva + korisniBroj;
//			}
//		}else {
//			System.out.println("Vrednost ne moze da bude veca od 200");
//		}
//		System.out.println(sumaParnihBrojeva);
		
		//ZADATAK 2 - Ispis parnih godina od 2023. do 2100. godine
//		for(int godina = 2023; godina<=2100; godina = godina+4) {
//			if(godina == 2023) {
//				godina++;
//			}
//			else if(godina%100 == 0) {
//				if(godina%400 == 0) {
//					System.out.println(godina);
//				}else {
//					continue;
//				}
//			}
//			System.out.println(godina);
//		}
		
		//VEZBE 3 - OOP
		int broj = 20; // primitivna promenljiva
		System.out.println("Primitivna promenljiva uvek vraca svoju vrednost: " + broj);
		Point p1 = new Point(); // Slozena promenljiva - promenljiva tipa reference - referenca
		System.out.println("Referenca sadrzi: " + p1);
		System.out.println("Vrednost atributa x objekta na koji pokazuje referenca p1: " + p1.getX());
		System.out.println("Vrednost atributa selected objekta na koji pokazuje referenca p1: " + p1.isSelected());
		//p1.x = 55;
		p1.setX(20);
		p1.setY(10);
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(10);
		System.out.println("Udaljenost izmedju tacki p1 i p2 je: " + p1.distance(p2));
		
	}

}
