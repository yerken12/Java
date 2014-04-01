import java.util.Scanner;
import java.math.*;

public class eüzerix {

	
	public static void main(String[] args) {
	double sonuc = 0;
	float deger;
	float carpim=1;
	Scanner scan = new Scanner(System.in);
	System.out.print("X ' in değerini girin: ");
	deger= scan.nextInt();
	for (int i = 0; i < deger; i++) {
		for(int j=1;j<=i;j++)
			{
			carpim*=j;	
			}
		sonuc+=(Math.pow(deger,((i))) /carpim);
		}
	System.out.println(" 'e' üzeri x 'in sonucu : " + sonuc + " dir.");	
	}
}
