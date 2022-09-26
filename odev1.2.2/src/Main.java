import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String[] öğrenciler = new String[3];
		öğrenciler[0] = "Ali";
		öğrenciler[1] = "Veli";
		öğrenciler[2] = "Aslı";
		 */
		 //String[] öğrenciler = new String[] {"hüseyin","veli","ali"};

		String[] öğrenciler = { "hüseyin", "veli", "ali" };

		for (int i = 0; i < öğrenciler.length; i++) {
			System.out.println(öğrenciler[i]);
		}

		System.out.println("-------------------");

		for (String ogrenci : öğrenciler) {
			System.out.println(ogrenci);
		}
		System.out.println("-------------------");

		double[] myList = new double[] { 1.2, 25.3, 4.3, 5.6 };
		double toplam = 0;

		for (double numbers : myList) {
			System.out.println(numbers);
			toplam += numbers;
		}
		System.out.println("toplam= " + toplam);

		System.out.println("-------------------");

		double max = myList[0];
		for (double number : myList) {
			if (max < number)
				max = number;
		}
		System.out.println("max= " + max);
	}

}
