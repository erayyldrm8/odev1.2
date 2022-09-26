
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 3;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				varMı = true;
				break;
			}
		}
		if(varMı)
			System.out.println(aranacak + " sayısı sayilar dizisinde var");
		else
			System.out.println(aranacak + " sayısı sayilar dizisinde yoktur");
	}

}
