package com.udit.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Chatroom is the mediator object and it facilitates the communication among
 * different persons.
 * 
 * @author udmishra
 *
 */
public class ChatRoom {

	private List<Person> persons = new ArrayList<>();

	public void join(Person p) {
		persons.add(p);
		broadcast(p, p.getName() + " has joined the room !");
	}

	public void broadcast(Person person, String message) {
		if (!persons.isEmpty()) {
			for (Person p : persons) {
				if (p != person) {
					p.receive(message);
				}
			}
		}
	}

	public void leave(Person p) {
		persons.remove(p);
		broadcast(p, p.getName() + " has left the room !");
	}
}
