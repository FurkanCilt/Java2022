package intro;

public class loopDemo {
	public static void main(String[] args) {
		//For,     i++ (artı 1 ekleyerek devam et anlamına gelir)
		
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For Döngüsü Bitti");

		//while,
		int i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
			
		}
		System.out.println("While Döngüsü Bitti");
		
		//Do-While   (şart sağlanmasa bile 1 kere çalışır
		int j=100;
		do {
		
			System.out.println(j);
			j+=2;
			
		
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
			
	}
	
			
}
