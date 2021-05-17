package com.java.springrabbitmqconsumer.services;

import org.springframework.amqp.core.Message;

public interface RabbitMQService {

	public void sendMessage(Message message);
	
	public void sendMessage(String routingKey, Message message);
	
	public void sendMessage(String exchange, String routingKey, Message message);
	
    public void convertAndSendMessage(Object message);
	
	public void convertAndSendMessage(String routingKey, Object message);
	
	public void convertAndSendMessage(String exchange, String routingKey, Object message);


}
