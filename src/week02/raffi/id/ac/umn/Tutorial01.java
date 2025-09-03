package week02.raffi.id.ac.umn;

import java.util.Scanner;

public class Tutorial01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String[] matkulIF = {"Matematika Diskrit", "Dasar-Dasar Pemrograman", 
				"Pemrograman Berorientasi Objek" };
		String[] matkulCE = {"Riset Operasi", "Jaringan Komputer", 
		"Aljabar Linear" };
		String[] matkulIS = {"Sistem Database", "Administrasi Database"};
	
		System.out.println("Pilih Kategori Mata Kuliah");
		System.out.println("1.informatika\n2.Computer Engineering\n3.Informative System");
		int input=scanner.nextInt();
	
		switch(input) {
		case 1: System.out.println("Daftar Mata Kuliah : "); show(matkulIF); break;
		case 2: System.out.println("Daftar Mata Kuliah : "); show(matkulCE); break;
		case 3: System.out.println("Daftar Mata Kuliah : "); show(matkulIS); break;
		}
	}
	public static void show(String [] matkul) {
		for(int i =0; i < matkul.length; i++) {
			System.out.println("- " + matkul[i]);
		}
	}
}
