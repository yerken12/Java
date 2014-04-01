import java.util.Scanner;


public class SayıTahmin {
	
	public static void main(String[] args) {
		
		int cevap = 20;
		int girdi = 0;
		
		boolean oyunDevam = true;
		
		Scanner scan = new Scanner(System.in);
		
		while(oyunDevam)
		{
			System.out.print("Bir sayi giriniz:");
			girdi = scan.nextInt();
			
			if(girdi > cevap)
			{
				System.out.println("Sayidan büyük değer girdiniz!");
			}
			else if(cevap > girdi)
			{
				System.out.println("Sayidan küçük değer girdiniz!");
			}
			else if(girdi == cevap)
			{
				System.out.println("Tebrikler! Doğru tahmin ettiniz...");
				oyunDevam = false;
			}
		}
	}
	

}
