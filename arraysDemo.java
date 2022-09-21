package intro;

public class arraysDemo {
	public static void main(String[] args) {
     String ogrenci1 = "Furkan";
     String ogrenci2 = "Melike";
     String ogrenci3 = "Ceren";
     String ogrenci4 = "Fehmiye";
     
     System.out.println(ogrenci1);
     System.out.println(ogrenci2);
     System.out.println(ogrenci3);
     System.out.println(ogrenci4);
     
     System.out.println("-------------------------------");
     
     String[] ogrenciler = new String[4];
     ogrenciler[0]="Furkan";
     ogrenciler[1]="Melike";
     ogrenciler[2]="Ceren";
     ogrenciler[3]="Fehmiye";
     //ogrenciler[4]="Celil"; hatalıdır. String değere uymamaktadır.
    
     
     for(int i=0;i<ogrenciler.length;i++) {
    	 System.out.println(ogrenciler[i]);
     }
     
     System.out.println("-------------------------------");
     
     
     for(String ogrenci:ogrenciler){
    	 System.out.println(ogrenci);
    	 
    	 
     }
 }
}