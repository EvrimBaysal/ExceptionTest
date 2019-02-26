package dreckiges;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * 1. Schritt: Sysntax des Umgangs mit Exceptions Neue Schlüsselwörter: try,
 * catch
 */
public class ExceptionTest {

	public static void main(String[] args) {
		// Beispiel1: Nullpointer
		String nullString = null;
		String leerString = "";
		// System.out.println("Der Nullstring hat: " + nullString.length() + "
		// Buchstaben"); //java.lang.NullPointerException
		System.out.println("Der Leerstring hat: " + leerString.length() + " Buchstaben");

		// Beispiel2: ArrayindexOutOfBounds
		String[] arrayStrings = new String[0];
		System.out.println("Das Stringarray hat: " + arrayStrings.length + " Elemente");
		// arrayStrings[0] = leerString; //java.lang.ArrayIndexOutOfBoundsException:

		// Beispiel3: Division durch null
		int i = 0;
		int j = 0;
		// System.out.println("i/j: " + (i/j)); //java.lang.ArithmeticException

		// Beispiel4: Falsche Eingabe
		
		// System.out.println("Gelesene Zahl: " + leser.nextInt());
		// //java.util.InputMismatchException

		// Lösung 1:
		// try : Testen, ob ein Programm-Block Exception-frei funktioniert
		try {
			System.out.println("Der Nullstring hat: " + nullString.length() + " Buchstaben");
		} catch (NullPointerException ne) { // Nur wenn eine NullPointerException passiert ist, wird der catch Block
											// ausgeführt
			System.out.println("Der Nullstring kann kein Methoden ausführen. Er ist auf null gerichtet");
			// return;
		}

		// Lösung 4:
		while (true) {
			try {
				Scanner leser = new Scanner(System.in);
				System.out.println("Bitte Zahl eingeben");
				System.out.println("Gelesene Zahl: " + leser.nextInt());
				break;
			} catch (InputMismatchException ie) {
				System.out.println("Hey, soll doch ne Zahl sein!");
				// return;
			}
		}

		System.out.println("Programm ist problemlos am Ende angekommen");
	}

}
