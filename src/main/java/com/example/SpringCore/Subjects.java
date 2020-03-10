package com.example.SpringCore;

import org.springframework.stereotype.Component;

//@Component("myOwnSubject")
//when we keep Component annotation, spring will create a shared instance in IOC and keep
//in JVM. by default shared instance(object) name will be class name with smallletters
//if we want to give our own name we have to pass it as string to component annotation

/*
 * 13:12:20.994 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean
 * 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
 * 13:12:21.005 [main] DEBUG
 * org.springframework.beans.factory.support.DefaultListableBeanFactory -
 * Creating shared instance of singleton bean 'myOwnSubject'
 * 
 */

public class Subjects {

	public void nameOfSubject() {
		
		System.out.println("Subject Name: Java");
		
	}

}
