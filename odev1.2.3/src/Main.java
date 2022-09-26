import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "ankara";
		sehirler[0][2] = "bolu";
		sehirler[1][0] = "izmir";
		sehirler[1][1] = "eskişehir";
		sehirler[1][2] = "malatya";
		sehirler[2][0] = "kars";
		sehirler[2][1] = "muğla";
		sehirler[2][2] = "bursa";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("----------------");
		}
		
		String mesaj="HAVA ÇOK güzel.";
		System.out.println(mesaj);
		/*
		System.out.println(mesaj.length());
		System.out.println(mesaj.charAt(4));

		System.out.println("----------------");
		System.out.println(mesaj.concat(" yaşasın"));
		System.out.println(mesaj);// mesaj değişkeni değişmedi
		System.out.println(mesaj.startsWith("h"));
		System.out.println(mesaj.endsWith("f"));
		
		char[] firstFiveChars=new char[5];
		mesaj.getChars(0, 5, firstFiveChars, 0); //5'i dahil etmiyo //void geriye bir şey değer döndürmüyor, firstFiveChars ın 0. elemanından baslayarak
		for (int i = 0; i < firstFiveChars.length; i++) {
			System.out.println(firstFiveChars[i]);
		}
		
		System.out.println("----------------");
		
		System.out.println(mesaj.indexOf('ç'));
		System.out.println(mesaj.indexOf("gü"));
		
		System.out.println("----------------");
		
		
		System.out.println(mesaj.lastIndexOf('ç'));
		System.out.println(mesaj.lastIndexOf("a ç"));//gereksiz
		*/
		System.out.println(mesaj.replace(' ','-')); // metindeki bütün seçili karakterleri değiştirir, mesaj değiştenini değiştirmez
		System.out.println(mesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,9));//9 dahil değil
		
		System.out.println("----------------");
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println("----------------");
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println("----------------");
		
		System.out.println(mesaj.trim());// sağ sol boşlukları kırpar
		
	}

}
