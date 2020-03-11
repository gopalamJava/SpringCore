package com.example.SpringCore;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * when 
 * 
13:22:33.242 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@3b192d32
13:22:33.268 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
13:22:33.321 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
13:22:33.325 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
13:22:33.328 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
13:22:33.331 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
13:22:33.343 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'myOwnSubject'
13:22:33.394 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@5f71c76a
*/

public class SpringCoreApplication {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		/*
		 * ApplicationContext ac1= new AnnotationConfigApplicationContext(Config.class);
		 * 
		 * Subjects sb=ac1.getBean("mysub2", Subjects.class); sb.nameOfSubject();
		 */
		
		Class c=Class.forName("com.example.SpringCore.Subjects");
		//testing git
		Object b=c.newInstance();
		
		c.getDeclaredConstructors();
		Method m=c.getDeclaredMethods()[0];
		m.invoke(b);
		
		
		
		
		
		
		
		
		
	}

}
