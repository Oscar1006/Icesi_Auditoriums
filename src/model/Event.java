package model;

public class Event {
	
	private String name;
	private String date;
	private int startTime; 
	private int endTime; 
	private String teacher; 
	private String faculty;
	private int people;
	
	public Event(String name, String date, int startTime, int endTime, String teacher, String faculty, int people) {
		this.name = name;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.teacher = teacher;
		this.faculty = faculty;
		this.people = people;
	}
	
}