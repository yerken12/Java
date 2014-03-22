/*
 * pisayisi.Java
 */
import java.util.Scanner;


public class pisayisi {

	public static void main(String[] args) {
		int kosul=0;
		int number;
		double pisayisi = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("1 den Kaca kadar hesaplansin = ");
		number=scan.nextInt();
		for( int i=1; i<number; i++ )
		{
			pisayisi+=4*(Math.pow(-1,(i+1))/((2*i)-1));
			if(kosul==0 && i == 200000 && i>200000)
			{
				kosul++;
				System.out.println((i) + ". sayı " + pisayisi);
				
			}
			
		}
		System.out.println(number+" . pi sayidir :" + pisayisi);
	}
}
