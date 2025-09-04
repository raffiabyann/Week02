package week02.raffi.id.ac.umn;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Masukkan Bulan (1-12)");
		int bulan=scanner.nextInt();
		
		switch(bulan) {
		case 1: System.out.println("Bulan Januari Memiliki 31 Hari"); break;
		case 2: System.out.println("Bulan Februari Memiliki 28 Hari"); break;
		case 3: System.out.println("Bulan Maret Memiliki 31 Hari"); break;
		case 4: System.out.println("Bulan April Memiliki 30 Hari"); break;
		case 5: System.out.println("Bulan Mei Memiliki 31 Hari"); break;
		case 6: System.out.println("Bulan Juni Memiliki 30 Hari"); break;
		case 7: System.out.println("Bulan Juli Memiliki 31 Hari"); break;
		case 8: System.out.println("Bulan Agustus Memiliki 31 Hari"); break;
		case 9: System.out.println("Bulan September Memiliki 30 Hari"); break;
		case 10: System.out.println("Bulan Oktober Memiliki 30 Hari"); break;
		case 11: System.out.println("Bulan November Memiliki 30 Hari"); break;
		case 12: System.out.println("Bulan Desember Memiliki 31 Hari"); break;
		default:System.out.println("Input tidak valid, masukkan angka 1-12");
		}
	}

}
