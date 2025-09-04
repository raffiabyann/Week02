package week02.raffi.id.ac.umn;

import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int min,max;
		int jumlah=0;
		
		System.out.println("Masukkan Nilai Terkecil :");
		min=scanner.nextInt();
		System.out.println("Masukkan Nilai Terbesar :");
		max=scanner.nextInt();
		
		for(int i=min; i<=max; i++) {
			int pembagi =0;
		for(int j =1; j<=i; j++ ) {
			if(i % j ==0) {
				pembagi++;
			}
		}
		if (pembagi == 2) {
			jumlah +=i;
		}
	}
		System.out.println("Jumlah dari semua nilai prima dari " + min + " sampai "+ max + " adalah "+jumlah);
}
}
