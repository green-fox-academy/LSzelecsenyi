package com.greenfox.printcolor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrintColorApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PrintColorConfig.class);

        blueColor blue = ctx.getBean(blueColor.class);
        blue.printColor();
    }

}
