package com.udit.mediator;

public class TestChatRoom {

	public static void main(String[] args) {
		
		ChatRoom room = new ChatRoom();
		
		Person udit = new Person("Udit", room);
		Person amit = new Person("Amit", room);
		
		room.join(udit);
		room.join(amit);
		
		udit.say("Hello Everyone !");
		amit.say("Hey, Udit !");
		
		Person sumit = new Person("Sumit", room);
		room.join(sumit);
		
		sumit.say("I am Sumit, nice to meet you guys !");
		
		room.leave(udit);
	}
}
