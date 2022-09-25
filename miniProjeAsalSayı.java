package intro;

public class miniProjeAsalSayı {
	public static void main(String[] args) {
		int number = 13;
		int remainder = number %2 ; //remainder= kalan ifadesi verir
		System.out.println(remainder);
		boolean isPrime = true; 
		
		if(number<1) {
			System.out.println("Geçersiz Sayı");
		
		}
		if(number==1) {
			System.out.println("Sayı Asal Değildir");
			return; 
			//return kod karşılık bulursa sorgunun devamını kullanmaz 
		
		}
		
		for (int i=2; i<number; i++) {
			if(number % i ==0) {
				isPrime = false;
			}
		}
		 if(isPrime) {
			 System.out.println("Sayı Asaldır");
			
			 
		 }else {
			 System.out.println("Sayı Asal Değildir");
		 }
		
	}

}
