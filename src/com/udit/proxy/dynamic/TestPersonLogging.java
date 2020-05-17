package com.udit.proxy.dynamic;

import java.lang.reflect.Proxy;

public class TestPersonLogging {

	public static void main(String[] args) {
		
		Human person = new Person("Udit");
		Human proxyPerson = (Human) Proxy.newProxyInstance(Human.class.getClassLoader(), new Class<?>[] {Human.class}, new LoggingHandler(person));
		
		proxyPerson.walk();
		proxyPerson.talk();
		proxyPerson.talk();
		
		System.out.println(proxyPerson);
	}
}
