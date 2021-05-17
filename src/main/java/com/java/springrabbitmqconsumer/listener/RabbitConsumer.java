package com.java.springrabbitmqconsumer.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.springrabbitmqconsumer.dto.MessageDTO;
import com.java.springrabbitmqconsumer.util.RabbitMQConstant;

@Component
public class RabbitConsumer {

	@RabbitListener(queues = RabbitMQConstant.QUEUE)
	public void recievedMessage(MessageDTO message) throws RuntimeException {


		if (message.getValue().matches("[0-9]+")) {
			Integer value = Integer.valueOf(message.getValue());
			System.out.println("Listner message Message is :- " + value);
			if (value > 3) {

				throw new RuntimeException("error");
			}

		} else {
			System.out.println("Listner Received Message is :- " + message);
		}
	}
}
