package ui;
import java.util.Scanner;
import model.University;

public class Main {

	public static void main(String[] args) {
		Scanner sInt = new Scanner (System.in);
		Scanner sString= new Scanner (System.in);
		Scanner sDouble= new Scanner (System.in);
		
		University icesi = new University();
		
		System.out.println("\nSeguimiento de hoy\n");
		
		boolean loop = false;
		
		while(loop) {
			System.out.println(" 1.Add event\n 2.Delete event \n 3.List events of five days\n");
			int pick = sInt.nextInt();
			
			switch (pick) {
			case 1:
				System.out.println("Digit name of the event");
				String name =sString.nextLine();
				System.out.println("Digit date of the event");
				String date;
				System.out.println("Digit start time of the event");
				int startTime;
				System.out.println("Digit end time of the event");
				int endTime;
				System.out.println("Digit name of the teacher in charge");
				String teacher;
				System.out.println("Digit the name of the responsable faculty");
				String faculty;
				System.out.println("Digit how many people attend");
				int people;
				
				
				break;
				
			}
		}
	}

}
