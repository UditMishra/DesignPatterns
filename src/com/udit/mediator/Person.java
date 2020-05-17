package com.udit.mediator;

/**
 * Here, Person talks to another Person only through Chatroom.
 * Person does not hold direct references to another person.
 * 
 * @author udmishra
 *
 */
public class Person {

	private String name;
	private ChatRoom room;

	public Person(String name, ChatRoom room) {
		this.name = name;
		this.room = room;
	}

	public void receive(String message) {
		System.out.println("[ " + name + "'s chatbox ] : " + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void say(String message) {
		room.broadcast(this, message);
	}
}
