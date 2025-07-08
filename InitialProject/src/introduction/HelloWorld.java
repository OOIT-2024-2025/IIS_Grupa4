package src.introduction;

import java.util.Iterator;

import src.geometry.Line;
import src.geometry.Point;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Hello World!");
		System.out.println("Ispisivanje teksta na konzoli");
		System.out.println("Posmatramo ponašanje print() metode");

		// var tip promenljive
		var broj = 10;
		System.out.println(broj);

		// NUMERICKE VREDNOSTI I KONVERZIJE
		// deklaracija
		int firstNumber;
		// inicijalizacija
		firstNumber = 7;
		// inicijalizacija i deklaracija
		int secondNumber = 2;
		System.out.println(firstNumber / secondNumber); // rezultat je celobrojna vrednost
		System.out.println(firstNumber + secondNumber); // rezultat je celobrojna vrednost
		// moze i deklaracija i inicijalizacija kao int firstNumber=7, secondNumber=2

		float f1 = 5.3f;
		double d1 = 5.1;
		System.out.println(f1 * d1); // implicitna konverzija
		// rezultat je decimalna vrednost i to tipa DOUBLE (float ima 32 bita, a double
		// 64)

		int i1 = 9; // int ima 32 bita
		double d2 = 2; // double ima 64 bita
		System.out.println(i1 / d2);
		// dobijamo double jer zauzima vecu memoriju (automatska konverzija)

		int rez = (int) (i1 / d2); // treba nam eksplicitna konverzija
		System.out.println(rez);

		// LOGICKI TIP PODATKA
		// konjunkcija, disjunkcija i negacija logičkih tipova - u knjizi detalji
		boolean alwaysTrue = true;
		boolean secondBoolean = false;
		System.out.println(alwaysTrue && secondBoolean);
		System.out.println(alwaysTrue || secondBoolean);
		System.out.println(!alwaysTrue);
		System.out.println(!secondBoolean);

		// CHAR i STRING
		char ch1 = 'a';
		char ch2 = '\n';
		// mozda ne komplikovati pa preskociti ovo poredjenje vec samo kreirati
		// stringove
		// na razlicite nacine za kasniju konkatenaciju
		String s1 = "abc";
		String s2 = "abc";
		if (s1 == s2)
			System.out.println("Referencira se postojeći objekat s1");
		else
			System.out.println("Kreira se novi objekat s2");

		String s3 = new String("kh");
		String s4 = new String("kh");
		if (s3 == s4)
			System.out.println("Referencira se postojeći objekat s3");
		else
			System.out.println("Kreira se novi objekat s4");

		// Konkatenacija
		String noviString = s1 + s3;
		System.out.println(noviString);
		noviString = noviString.concat(s2);
		System.out.println(noviString);
		noviString = noviString + ch1;
		// concat ne moze za string i char
		System.out.println(noviString);

		// konverzija string u int
		String brojKaoString = "5";
		System.out.println(brojKaoString + firstNumber); // rezultat je spajanje 5 i 7 kao 57
		// int intOdStringa = (int)brojKaoString; ne moze ovako vec kao ispod
		int intOdStringa = Integer.parseInt(brojKaoString);
		System.out.println(firstNumber + intOdStringa); // rezultat je sabiranje 5 i 7 kao 12
		
		// kreiranje objekta i pozivi metoda
		// kreiranje instance/objekta klase Point
		Point point1 = new Point();
		System.out.println("XCoord: "+ point1.getXCoord());
		point1.setXCoord(3);
		System.out.println("XCoord: "+ point1.getXCoord());
		
		Point point2 = new Point();
		System.out.println("XCoord: "+ point2.getXCoord());
		point2.setXCoord(10);
		System.out.println("XCoord: "+ point2.getXCoord());
		System.out.println("XCoord: "+ point1.getXCoord());
		
		double result = point1.distance(point2);
		System.out.println("Distance: "+ result);
		double result2 = point1.distance(point2.getXCoord(), point2.getYCoord());
		System.out.println("Distance: "+ result2);
		
		// Trece vezbe
		// 1. Proizvoljno kreirati objekte klase tačka point1, 
		// point2 i klase Line line1
		Point point1a = new Point();
		Point point2a = new Point();
		
		// 2. Koordinatama tačaka dodeliti željene vrednosti 
		// point1a x koord sa 0 na 10
		point1a.setXCoord(10);
		point1a.setYCoord(20);
		point2a.setXCoord(40);
		point2a.setYCoord(30);
		
		System.out.println("XCoord point1: "+ point1a.getXCoord());
		System.out.println("YCoord point1: "+ point1a.getYCoord());
		System.out.println("XCoord point2: "+ point2a.getXCoord());
		System.out.println("YCoord point2: "+ point2a.getYCoord());
		
		// 3. Promeniti x koordinatu tačke point1a na vrednost 
		// y koordinate tačke point2a
		point1a.setXCoord(point2a.getYCoord());
		
		// 4. Pristupiti početnoj tački (tj. njenim koordinatama) objekta line1
		Line line1 = new Line();
		// da ne bi bilo NullPointerException setuj pocetnu i krajnju tacku linije line1
		line1.setStartPoint(point1a);
		line1.setEndPoint(point2a);
		
		System.out.println(line1.getStartPoint().getXCoord());
		System.out.println(line1.getStartPoint().getYCoord());
		

	}

}
