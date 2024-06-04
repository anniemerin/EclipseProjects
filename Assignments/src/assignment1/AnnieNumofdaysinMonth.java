package assignment1;

import java.util.Scanner;

public class AnnieNumofdaysinMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a month in Mon format");
		String month=scanner.nextLine();
		int numdays=0;
		switch (month) {
		case "Jan":		
			numdays=31;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Feb":
			numdays=29;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Mar":	
			numdays=31;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Apr":
			numdays=30;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "May":
			numdays=31;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Jun":
			numdays=30;
		//	System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Jul":
			numdays=31;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Aug":	
			numdays=31;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Sep":
			numdays=30;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Oct":	
			numdays=31;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Nov":
			numdays=30;
			//System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
		case "Dec":	
			numdays=31;
		//	System.out.println("Number of days in the month "+month+" : "+numdays);
			break;
			
		default:
			System.out.println("Invalid value is entered");				
			
		}
		if(numdays>0)
		{
		System.out.println("Number of days in the month "+month+" : "+numdays);
		}
		scanner.close();
	}

}
