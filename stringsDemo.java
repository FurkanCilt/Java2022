package intro;

public class stringsDemo {
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
				System.out.println(mesaj);
//				//char = karakter (metin içerisinde belirli karakterde ki değeri yakalamak için)
//				
//				System.out.println("Eleman sayısı:" +mesaj.length());
//				System.out.println("5.eleman :" +mesaj.charAt(4));
//				
//				//concat = birleştirme fonksiyonu vardır 
//				System.out.println(mesaj.concat(" Yaşasın!"));
//				
//				//startswith = ile başlıyor mu anlamı verir
//				System.out.println(mesaj.startsWith("B"));
//				
//				//endswith = ile bitiyor mu anlamı verir  
//				System.out.println(mesaj.endsWith("l"));
//				
//				char[] karakterler = new char[5];
//				mesaj.getChars(0, 5, karakterler, 0);
//				System.out.println(karakterler);
//				
//				//indexOf metinde karakter araması yapar
//				System.out.println(mesaj.indexOf("a"));
//				//lastindexof metinde sonda başlayarak karakter araması yapar
//				System.out.println(mesaj.lastIndexOf("e"));
				
				String yeniMesaj = mesaj.replace(' ', '-');
				System.out.println(yeniMesaj);
				
				//substring = -den itibaren al anlamı verir. (ikili aralık verirse o aralık arasında çalışır
				System.out.println(mesaj.substring(2,7));
				
				//split - metni karakter dizisini dikkate alarak parçalamaya yarar
				for (String kelime : mesaj.split(" ")) {
					System.out.println(kelime);
					
				}
				//toLowerCase - değeri küçük harf yapmak için
				//toUpperCase- değeri büyük harf yapmak için
				System.out.println(mesaj.toLowerCase());
				System.out.println(mesaj.toUpperCase());
				
				
				
			
				
	
				
				
				

				
				
				
				
			
			
				
				
				
	}
}
