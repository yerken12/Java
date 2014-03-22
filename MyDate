	/* 
	MyDate.java
	*/
	import java.text.DateFormat; 
	import java.text.ParseException; 
	import java.text.SimpleDateFormat; 
	import java.util.Date; 
	
	public class MyDate { 
		
	private int year; 
	private int mounth; 
	private int day; 
	
	public int getYear(){ 
		return year; 
	} 
	
	public void setYear(int y) 
	{ 
		if (y < 0) 
			{ 
				y = 2014; 
			} 
		year = y; 
	} 
	
	public int getMounth() 
		{ 
			return mounth; 
		} 
	
	public void setMounth(int m) 
	{ 
			if (m < 1 || m > 12) 
				{ 
					m = 1;
					System.out.println("Yanlýþ giriþ yaptýnýz!!");
					System.exit(0);
				} 
			mounth = m; 
	} 
	
	public int getDay() 
	{ 
		return day; 
	} 
	
	public void setDay(int d) 
	{  
		if (d < 1 || d > 31) 
			{
			d = 1; 
			System.out.println("Yanlýþ giriþ yaptýnýz!!");
			System.exit(0);	
			} 
		day = d; 
	} 
	
	public String getDate() 
		{ 
		 return String.format("%d/%d/%d", getDay(), getMounth(), getYear()); 
		} 
	
	public boolean isBigger(MyDate md)
	{ 
		String staticDateString = "14/01/2014"; 
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
		Date startDate; 
	
	try { 
		startDate = df.parse(staticDateString); 
		Date userDate = df.parse(md.getDate()); 
	
	if (startDate.compareTo(userDate) < 0) 
		{ 
			return true; 
		} 
	} catch (ParseException e) 
		{ 
		e.printStackTrace(); 
		} 
	return false; 
		} 
	
	}
