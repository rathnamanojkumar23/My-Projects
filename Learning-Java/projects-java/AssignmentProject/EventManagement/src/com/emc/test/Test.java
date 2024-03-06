package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		
		Organizer organizer = new Organizer();
		organizer.id = 123;
		organizer.name = "Apple";
		System.out.println("organizer");
		
		
		Event event = new Event(456, "Iphone", "launch");
		System.out.println("Event");
		
	}

}
