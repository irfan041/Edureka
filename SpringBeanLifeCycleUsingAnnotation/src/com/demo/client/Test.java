package com.demo.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Message;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Message message = ctx.getBean( Message.class);
		message.setMessageId(101);
		message.setMessage("Spring");
		
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		ctx.close();

	}

}
