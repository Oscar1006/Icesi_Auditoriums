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
}
