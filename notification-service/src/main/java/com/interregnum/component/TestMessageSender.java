package com.interregnum.component;

import org.springframework.stereotype.Service;

@Service
public class TestMessageSender<T> implements MessageSender<T>{

	public void send(T message) {
		
	}
	
	public T testSend(T message) {
		return message;
	}

}
