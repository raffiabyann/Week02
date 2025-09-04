package week02.raffi.id.ac.umn;

import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Masukkan angka: ");
	    int angka = scanner.nextInt();

	    if (angka <= 1) {
	        System.out.println("Angka " + angka + " adalah bukan angka prima");
	        return;
	    }

	    int pembagi = 0;
	    for (int i = 1; i <= angka; i++) {
	        if (angka % i == 0) {
	            pembagi++;
	        }
	    }

	    if (pembagi == 2) {
	        System.out.println("Angka " + angka + " adalah angka prima");
	    } else {
	        System.out.println("Angka " + angka + " adalah bukan angka prima");
	    }
	}
}
