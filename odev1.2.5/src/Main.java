
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf = 'i';

		char[] kalınUnluler = { 'a', 'ı', 'o', 'u' };
		char[] incenUnluler = { 'e', 'i', 'ö', 'ü' };

		for (char inceUnlu : incenUnluler) {
			if (harf == inceUnlu) {
				System.out.println(harf + " harfi ince ünlüdür");

			}
		}
		for (char kalınünlü : kalınUnluler) {
			if (harf == kalınünlü) {
				System.out.println(harf + " harfi kalın ünlüdür");

			}
		}
		System.out.println("-------------");
		// -------------------------------------------------------------------------------
		// 2.yol
		char[] Unluler = { 'a', 'ı', 'o', 'u', 'e', 'i', 'ö', 'ü' };
		boolean unsuzMu=true;
		for (char Unlu : Unluler) {
			if (harf == Unlu) {
				if (harf == 'a' | harf == 'ı' | harf == 'o' | harf == 'u') {		//  && || de kullanılabilir
					System.out.println(harf + " harfi kalın ünlüdür");
				} 
				else if (harf == Unlu | harf == 'e' | harf == 'i' | harf == 'ö' | harf == 'ü')
					System.out.println(harf + " harfi ince ünlüdür");
				unsuzMu=false;
			}

		}

		if(unsuzMu)
		 System.out.println(harf + " harfi ünsüzdür");
		
		System.out.println("-------------");
		// --------------------------------------------------------------------------------
		// 3.yol

		
		  switch (harf) { case 'a': case 'ı': case 'o': case 'u':
		  System.out.println(harf + " harfi kalın ünlüdür"); break; case 'e': case 'i':
		  case 'ö': case 'ü': System.out.println(harf + " harfi ince ünlüdür"); break;
		  default: System.out.println(harf + " harfi ünlü değildir");
		  
		  
		  }
		 
	}
}
