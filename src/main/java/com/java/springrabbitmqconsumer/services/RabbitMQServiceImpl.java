package com.java.springrabbitmqconsumer.services;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements RabbitMQService{

	@Autowired
	private AmqpTemplate rabbitTemplate;
		

	@Override
	public void sendMessage(Message message) {
		rabbitTemplate.send(message);
		System.out.println("Sending msg = " + message);		
	}
	
	@Override
	public void sendMessage(String routingKey, Message message) {
		rabbitTemplate.send(routingKey, message);
		System.out.println("Sending msg = " + message);		
	}
	
	@Override
	public void sendMessage(String exchange, String routingKey, Message message) {
		rabbitTemplate.send(exchange, routingKey, message);
		System.out.println("Sending msg = " + message);		
	}
	
	@Override
	public void convertAndSendMessage(Object message) {
		rabbitTemplate.convertAndSend(message);
		System.out.println("Sending msg = " + message);		
	}
	
	@Override
	public void convertAndSendMessage(String routingKey, Object message) {
		rabbitTemplate.convertAndSend(routingKey, message);
		System.out.println("Sending msg = " + message);		
	}
	
	@Override
	public void convertAndSendMessage(String exchange, String routingKey, Object message) {
		rabbitTemplate.convertAndSend(exchange, routingKey, message);
		System.out.println("Sending msg = " + message);		
	}
}
