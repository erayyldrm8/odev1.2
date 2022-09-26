
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 15;
		/*
		if (number % 2 != 0 & number % 3 != 0 & number % 5 != 0 & number % 7 != 0) {
			// if (number % 3 != 0) { // if (number % 5 != 0) { // if (number % 7 != 0) {
			System.out.println(number + " sayısı asaldır"); // } // } // }

		} else {
			System.out.println(number + " sayısı asal değildir");

		}
		*/
//----------------------------------------------------------------------------
		/*
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("not prime");
				break;
			}
			 else if (i == number - 1) {
				System.out.println(" prime");
			}
		}
		 */
//----------------------------------------------------------------------------
		boolean isPrime=true;
		
		if(number<=1)
		{
		System.out.println("geçersiz sayı girdiniz, 1 den büyük tamsayı giriniz");
		//return; // static void mainden çıkar direkt (satırların sonuna atar)
		}
		
		
		else //else yerine yukardaki (36.satır) return de kullanılabilirdi
		{
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime=false;
			}
		}
		if(isPrime) // if(isPrime==true) ile aynıdır
			System.out.println("asaldır");
		else
			System.out.println("asal değildir");
		}
		

	}

}
