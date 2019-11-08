package model;
import java.util.ArrayList;

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
	public String addEvent(String name, String date, int startTime, int endTime, String teacher, String faculty, int people) {
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
}