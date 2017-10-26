package com.greenfox.helloworld;

import com.greenfox.printcolor.MyColor;
import com.greenfox.printcolor.PrintColorConfig;
import com.greenfox.printcolor.blueColor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();

		ApplicationContext ctxx = new AnnotationConfigApplicationContext(PrintColorConfig.class);

		MyColor blue = ctxx.getBean(blueColor.class);
		blue.printColor();
	}
}
