package com.udit.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {

	private Map<String, Integer> methodsCallCountMap = new HashMap<>();
	private Object target;

	public LoggingHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		String name = method.getName();

		if (name.contains("toString")) {
			return methodsCallCountMap.toString();
		}

		methodsCallCountMap.merge(name, 1, Integer::sum);
		return method.invoke(target, args);
	}

}
