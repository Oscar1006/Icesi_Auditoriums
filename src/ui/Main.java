package ui;
import java.time.LocalDate;
import java.util.Scanner;
import model.University;

public class Main {

	public static void main(String[] args) {
		Scanner sInt = new Scanner (System.in);
		Scanner sString= new Scanner (System.in);
	
		
		University icesi = new University();
		
		System.out.println("\nSeguimiento de hoy\n");
		
		boolean loop = true;
		String info = "";
		
		while(loop) {
			System.out.println(" 1.Add event\n 2.Delete event \n 3.List events of the next five days\n 4.Exit");
			int pick = sInt.nextInt();
			
			switch (pick) {
			case 1:
				System.out.println("Digit name of the event");
				String name = sString.nextLine();
				System.out.println("	Digit date of the event\nYear: ");
				int year = sInt.nextInt();
				System.out.println("Month: ");
				int month = sInt.nextInt();
				System.out.println("Day: ");
				int day = sInt.nextInt();
				LocalDate date = LocalDate.of(year, month, day);
				System.out.println("Digit start time of the event");
				int startTime = sInt.nextInt();
				System.out.println("Digit end time of the event");
				int endTime = sInt.nextInt();
				System.out.println("Digit name of the teacher in charge");
				String teacher = sString.nextLine();
				System.out.println("Digit the name of the responsable faculty");
				String faculty = sString.nextLine();
				System.out.println("Digit how many people attend");
				int people = sInt.nextInt();
				
				info = icesi.addEvent(name, date, startTime, endTime, teacher, faculty, people);
				System.out.println(info);
				break;
				
			case 2:
				System.out.println("Digit name of the event to remove");
				String nameToRemove = sString.nextLine();
				info = icesi.removeEvent(nameToRemove);
				System.out.println(info);
				break;
				
			case 3:
				info = icesi.listEventsFive();
				System.out.println(info);
				break;
			case 4:
				loop = false;
				break;
			}
		}
	}

}
