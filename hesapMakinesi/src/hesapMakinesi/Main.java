package hesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1,n2,select;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ýlk sayýyý giriniz: ");
		n1=scan.nextInt();
		System.out.println("Ýkinci sayýyý giriniz: ");
		n2=scan.nextInt();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiminiz: ");
		select=scan.nextInt();
		
		switch (select) {
		case 1:
			System.out.print("Toplam: "+(n1+n2));
			break;
		case 2:
			System.out.print("Çýkarma: "+(n1-n2));
			break;
		case 3:
			System.out.print("Çarpma: "+(n1*n2));
			break;
		case 4:
			System.out.print("Bölme: "+(n1/n2));
			break;
		default:
			System.out.print("Geçersiz iþlem seçildi.");
			break;
		}
				
		
	}

}
