package main;

import java.util.HashMap;
import java.util.Map;

import geometry.Circle;
import geometry.Donut;
import geometry.Point;
import geometry.Rectangle;

public class Main {
	

	public static void main(String[] args) {
		
		int brojJedan = 1;
//		double decimalniBroj = 1.5; // default 0.0
//		boolean check = true; // default false
//		char a = 'a';
//		String abc = "abc"; // default "" 
		
		
		//ZADATAK ZA VEZBU
//		System.out.println("Unesite aritemticku operaciju"
//				+ "koju zelite da izvrsite");
//		Scanner scanner = new Scanner(System.in);
//		char operacija = scanner.next().charAt(0);
//		System.out.println(operacija);
		
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
		//int broj = 20; // primitivna promenljiva
		//System.out.println("Primitivna promenljiva uvek vraca svoju vrednost: " + broj);
		//Point p1 = new Point(); // Slozena promenljiva - promenljiva tipa reference - referenca
		// Referenca p1 pokazuje na objekat tipa Point - Objekat 1
		//System.out.println("Referenca sadrzi: " + p1);
		//System.out.println("Vrednost atributa x objekta na koji pokazuje referenca p1: " + p1.getX());
		//System.out.println("Vrednost atributa selected objekta na koji pokazuje referenca p1: " + p1.isSelected());
		//p1.x = 55;
//		p1.setX(20);
//		p1.setY(10);
//		Point p2 = new Point(); //Pokazuje na objekat tipa Point - Objekat 2
//		p2.setX(10);
//		p2.setY(10);
		//System.out.println("Udaljenost izmedju tacki p1 i p2 je: " + p1.distance(p2));
		
		//Line l1 = new Line(); // Pokazuje na objekat tipa Line - Objekat 3
//		System.out.println(l1);
//		System.out.println(l1.getStartPoint());
//		System.out.println(l1.getEndPoint());
//		l1.setStartPoint(p1);
//		System.out.println(l1.getStartPoint().getX());
//		
//		Line l2 = new Line(p1,p2,true);
//		System.out.println(l2.getEndPoint().getY());
//		Rectangle r1 = new Rectangle(new Point(50,50),30,30);
//		Circle c1 = new Circle(l2.getEndPoint(), 40);
//		
//		System.out.println("Tri reference pokazuju na isti objekat");
//		p2.setX(100);
//		c1.getCenter().setX(150);
//		System.out.println(p2.getX());
//		System.out.println(l2.getEndPoint().getX());
//		System.out.println(c1.getCenter().getX());
		
		// VEZBE 5 - Klasa Object i overriding
		
//		Point p1 = new Point();
//		System.out.println("Rad metode toString(): " + p1.toString());
//		//System.out.println("Vrednost reference: " + p1);
//		Line l1 = new Line(p1, new Point(10,20));
//		//System.out.println("Rad metode toString(): " + l1.toString());
//		Point p2 = new Point();
//		System.out.println("Rad metode toString(): " + p2.toString());
//		//p1 = p2; // Nakon ove instrukcije p1 pokazuje na isti objekat
//		//kao i p2
//		
//		
//		Rectangle r1 = new Rectangle(new Point(50,50),20,30);
//		System.out.println(r1.getHeigth());
//		System.out.println(r1.isSelected());
//		System.out.println(r1.getUpperLeft());
		
		
		// Vezbe 6
		Donut d1 = new Donut(new Point(0,0),30,20);
		//System.out.println(d1.toString());
		
		// Vezbe 7
		Circle c1 = new Circle();
//		System.out.println(c1.broj);
//		c1.broj = 30;
//		Circle c2 = new Circle();
//		System.out.println(c2.broj);
		
		Point p1 = new Point(50,50);
		Point p2 = new Point(60,60);
		//System.out.println(p1.compareTo(p2));
		
		Rectangle r1 =  new Rectangle(p1, 40,40);
		Rectangle r2 =  new Rectangle(p2, 80,80);
		//System.out.println(r2.compareTo(r1));
		
		// ======VEZBE 8=======
//		int[] nizBrojeva = new int[5];
//		nizBrojeva[0] = 4;
//		nizBrojeva[1] = 5;
//		nizBrojeva[2] = 6;
//		nizBrojeva[3] = 7;
//		nizBrojeva[4] = 8;
		
		int[] nizBrojeva = {4,5,6,7,8,9,10,11,12,13};
		for(int i = nizBrojeva.length-1; i>=0; i--) {
			nizBrojeva[i] = nizBrojeva[i]*5;
			// nizBrojeva[i]*=5;
//			System.out.println("Vrednost elementa niza na "
//					+ "indeksu " + i +" je: " + nizBrojeva[i]);
		}
		
		HashMap<String,String> mapa = new HashMap<String,String>();
		mapa.put("txt", "notepad.exe");
		mapa.put("bmp", "paint.exe");
		mapa.put("dib", "paint.exe");
		mapa.put("rtf", "wordpad.exe");
		
		mapa.replace("rtf", "winword.exe");
		//mapa.put("rtf", "winword.exe");
		
		if(!mapa.containsKey("tif")) {
			//System.out.println("Kljuc tif ne postoji u mapi");
		}
		if(!mapa.containsKey("ht")) {
			mapa.put("ht", "hypertrm.exe");
			//System.out.println("Dodat je novi key value par ht:hypertrm.exe");
		}
		
		for(Map.Entry<String, String> es: mapa.entrySet()) {
			//System.out.println(es);
		}
		
		if(mapa.containsKey("doc")) {
			mapa.remove("doc");
		}else {
			//System.out.println("Key value par sa vrednoscu kljuca doc ne postoji!");
		}
		
		
		// ======VEZBE 9=======
		System.out.println(c1.getRadius());
		try {
			c1.setRadius(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(c1.getRadius());
		
	}

}
