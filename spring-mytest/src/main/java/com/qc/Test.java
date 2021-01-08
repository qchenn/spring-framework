package com.qc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.nio.charset.Charset;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		User user = (User) context.getBean("user");
		System.err.println(Charset.defaultCharset().name());
		System.err.println(System.getProperty("file.encoding"));
		System.err.println(user.toString());
	}
}
