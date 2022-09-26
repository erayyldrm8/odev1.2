
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// mükemmel sayılar
		int number = 6;
		int toplam = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				toplam += i;
			}
		}
		if (toplam == number) {
			System.out.println(number + " mükemmel sayıdır");
		} else {
			System.out.println(number + " mükemmel sayı değildir");
		}

		// arkadaş sayılar
		int number1 = 220;
		int number2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				toplam1 += i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				toplam2 += i;
			}
		}
		if (toplam1 == number2 & toplam2 == number1) {		//  && || de kullanılabilir
			System.out.println(number1 +" ve "+ number2 + " arkadaş sayılardır");
		} 
		else {
			System.out.println(number1 +" ve "+ number2 + " arkadaş sayılar değildir");
		}
	}

}
