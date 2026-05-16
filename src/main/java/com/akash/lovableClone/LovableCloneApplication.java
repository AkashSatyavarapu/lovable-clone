package com.akash.lovableClone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class LovableCloneApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(LovableCloneApplication.class, args);

		//TO CHECK LIST OF BEANS CREATED  WITHOUT ACTUATOR
		/*ConfigurableApplicationContext ctx = SpringApplication.run(LovableCloneApplication.class, args);
		System.out.println("Number of Beans created: "+ctx.getBeanDefinitionCount());
		String[] beans = ctx.getBeanDefinitionNames();
		Arrays.sort(beans);
		for(String bean : beans)
		{
			System.out.println(bean);
		}*/
	}

}
