
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");

		int ali = 58;
		char karakter = 'a';
		String mesaj = "ali nin yaşı= ";

		System.out.println("ali= " + ali);
		System.out.println(mesaj + ali);

		boolean dogruMu = false;

		if (dogruMu == false) {
			System.out.println("false");
		}

		if (ali < 55) {
			System.out.println("ali<55");
		} else if (ali == 55) {
			System.out.println("ali=55");
		} else {
			System.out.println("ali>55");
		}

		/////////////////////////////////////////////////////////////////////

		int[] sayilar = { 22, 54, 14, 7 }; // int[] sayilar = new int[] {22,54,14,7}; de kabul

		/*
		 * for(int i=0; i<sayilar.length; i++) { System.out.println(sayilar[i]); }
		 */

		int enBuyuk = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (enBuyuk < sayilar[i]) {
				enBuyuk = sayilar[i];
			}
		}
		System.out.println(enBuyuk);

		/////////////////////////////////////////////////////////////////////

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("pek iyi");
			break;
		case 'B':
			/*System.out.println("iyi");
			break;*/
		case 'C':
			System.out.println("eh işte");
			break;
		case 'D':
			System.out.println("kaldın");
			break;
		default:
			System.out.println("geçersiz not");

		}
	}

}
