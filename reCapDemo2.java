package intro;

public class reCapDemo2 {
	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,8.6};
		double total = 0;
		double enBuyuk= myList[0];
		
		
		for(double number:myList) {
			if(enBuyuk<number) {
				enBuyuk = number;
				
			}
			total = total+number;
			System.out.println(number);
		}
		
		System.out.println("Toplam ="+total);
		System.out.println("En Büyük ="+enBuyuk);
		
		
		
		
	}

}
