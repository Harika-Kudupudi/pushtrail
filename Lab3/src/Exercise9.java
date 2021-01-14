/**
	 * Display the date in duration of days, months and years.
	 * @author Harika
	 *
	 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Exercise9 {

	  public static void Duration(String a)
      {
	   LocalDate date=LocalDate.now();
	
	   DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	   
	   LocalDate d=LocalDate.parse(a,formatter);
	  
	   Period p=Period.between(d, date);
	   int count1=Math.abs(p.getYears());
	   int count2=Math.abs(p.getMonths());
	   int count3=Math.abs(p.getDays());
	   System.out.println(count1);
	   System.out.println(count2);
	   System.out.println(count3);
      }
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in dd-mm-yyyy format:");
		String s=sc.nextLine();
		Duration(s);
		
	}
}
