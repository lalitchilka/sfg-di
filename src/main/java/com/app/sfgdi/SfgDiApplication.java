package com.app.sfgdi;

import com.app.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("======= I18n Greeting");
		I18nCOntroller i18nCOntroller = (I18nCOntroller) ctx.getBean("i18nCOntroller");
		System.out.println(i18nCOntroller.getGreeting());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("======= Primary Greeting");
		String greetings = myController.sayHello();
		System.out.println(greetings);

		System.out.println("======= Property Greeting");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("======= Setter Greeting");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("======= Controller Greeting");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());
	}

}
