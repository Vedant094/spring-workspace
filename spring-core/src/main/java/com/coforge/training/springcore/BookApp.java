package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Book;

public class BookApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BookConfig.xml");

		Book obj=(Book) context.getBean("book1");
		Book obj1=(Book) context.getBean("book2");
		Book obj2=(Book) context.getBean("book3");
		
		System.out.println("****************Book Details**************");
		
		obj.display();
		obj1.display();
		obj2.display();
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
