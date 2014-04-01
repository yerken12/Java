/* 
MyDateTest.java 
 */
import java.text.DateFormat; 
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Scanner; 
 
public class MyDateTest {  
	public static void main(String[] args) { 
	 int gun, ay, yil; 
	 
	 MyDate staticDate = new MyDate(); 
	 staticDate.setDay(14); 
	 staticDate.setMounth(01); 
	 staticDate.setYear(2014); 
	 System.out.println(staticDate.getDate()); 
	 
	 MyDate userDate = new MyDate(); 
	 
	 Scanner input = new Scanner(System.in); 
	 System.out.println("Kıyaslama yapabilmek için lütfen bir tarih belirtin:"); 
	 System.out.print("Gün: "); 
	 gun = input.nextInt(); 
	 System.out.print("Ay: "); 
	 ay = input.nextInt(); 
	 System.out.print("Yıl: "); 
	 yil = input.nextInt(); 
	 
	 userDate.setDay(gun); 
	 userDate.setMounth(ay); 
	 userDate.setYear(yil); 
	 
	 System.out.println(userDate.getDate()); 
	 
	 if(staticDate.isBigger(userDate)) { 
	 System.out.println("Girdiğiniz tarih büyüktür!"); 
	 System.out.println(staticDate.getDate() + " < " + userDate.getDate()); 
	 } 
	 else{ 
		 System.out.println("Girdiğiniz tarih küçüktür!"); 
		 System.out.println(staticDate.getDate() + " > " + userDate.getDate()); 
		 } 
	 } 
	} 
	
	
