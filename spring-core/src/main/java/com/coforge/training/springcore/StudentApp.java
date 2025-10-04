package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Student;

//Spring App to demonstrate DI using Setter Method with XMl Config
public class StudentApp {
	public static void main(String[] args) {


		ApplicationContext context=new ClassPathXmlApplicationContext("StudentConfig.xml");
		Student obj=(Student) context.getBean("student1");
		Student obj1=(Student) context.getBean("student2");
		Student obj2=(Student) context.getBean("student3");
		System.out.println("****************Student Details**************");
		System.out.println(obj.getRollNo()+" "+obj.getName()+" "+obj.getCollege()+" "+obj.getMarks());
		System.out.println(obj1.getRollNo()+" "+obj1.getName()+" "+obj1.getCollege()+" "+obj1.getMarks());
		System.out.println(obj2.getRollNo()+" "+obj2.getName()+" "+obj2.getCollege()+" "+obj2.getMarks());
		
		((ClassPathXmlApplicationContext) context).close();

	}
}
