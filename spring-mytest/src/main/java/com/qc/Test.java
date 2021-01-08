package com.qc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		User user = (User) context.getBean("user");
		System.err.println(System.getProperty("file.encoding"));
		System.err.println(user.toString());
	}
}
