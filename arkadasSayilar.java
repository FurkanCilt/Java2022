package intro;

public class arkadasSayilar {
	public static void main(String[] args) {
//En küçük arkadaş sayılar 220-284 (kendileri hariç pozitif tam bölenlerinin toplamı eşit olan sayılara arkadaş sayı denir)
	
	
	int sayi1= 220;
	int sayi2= 284;
	int toplam1= 0;
	int toplam2= 0;
	
	for(int i=1; i<sayi1; i++){
		if(sayi1%i==0) {   // bu ifade sayı1 i ye tam bölünüyorsa anlamı vermektedir.)
			toplam1 = toplam1+i;
			
		}
		
		
	}
	for(int i=1; i<sayi2; i++){
		if(sayi2%i==0) {   // bu ifade sayı1 i ye tam bölünüyorsa anlamı vermektedir.)
			toplam2 = toplam2+i;	
		
}
}
	if(sayi1==toplam2 && sayi2 == toplam1) {   //&& ifadesi 've' anlamı vermektedir
		System.out.println("Bu iki sayı arkadaştır");
		
	}else {
		System.out.println("Bu iki sayı arkadaş değildir");
	}
	}
}