package hesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1,n2,select;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�lk say�y� giriniz: ");
		n1=scan.nextInt();
		System.out.println("�kinci say�y� giriniz: ");
		n2=scan.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.println("Se�iminiz: ");
		select=scan.nextInt();
		
		switch (select) {
		case 1:
			System.out.print("Toplam: "+(n1+n2));
			break;
		case 2:
			System.out.print("��karma: "+(n1-n2));
			break;
		case 3:
			System.out.print("�arpma: "+(n1*n2));
			break;
		case 4:
			System.out.print("B�lme: "+(n1/n2));
			break;
		default:
			System.out.print("Ge�ersiz i�lem se�ildi.");
			break;
		}
				
		
	}

}
