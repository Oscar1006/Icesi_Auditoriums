package model;
import java.util.ArrayList;
import java.time.LocalDate;

public class University {
//Constant
	public static final int nAuditoriums = 8;
//Relationships
	Auditorium auditoriums[];
	ArrayList <Event> events;
	
	public University(){
		auditoriums = new Auditorium[nAuditoriums];
		events = new ArrayList<Event>();
	}
	public String addEvent(String name, LocalDate date, int startTime, int endTime, String teacher, String faculty, int people) {
		String info = "Event added";
		Event e = new Event(name, date, startTime, endTime, teacher, faculty, people);
		events.add(e);
		return info;
	}
	public String removeEvent(String name) {
		String info ="Event not found";
			for(int i=0;i<events.size();i++) {
				if (events.get(i).getName().equalsIgnoreCase(name)) {
					events.remove(i);
					info = "Event removed";
				}
			}
		return info;
	}
	
	public String listEventsFive() {
		String info = "";
		LocalDate today = LocalDate.now();
		LocalDate tPlusFive = today.plusDays(5);
		for (int i=0; i<events.size();i++) {
			if (events.get(i).getDate().isAfter(today) && events.get(i).getDate().isBefore(tPlusFive)) {
				info += "\n"+ events.get(i).getName();
			}
		}
		return info;
	}
}