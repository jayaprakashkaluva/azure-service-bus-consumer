package com.jp.messaging.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ProductListener {

	 private static final String QUEUE_NAME = "products/subscriptions/product";

	    private final Logger logger = LoggerFactory.getLogger(ProductListener.class);

	    @JmsListener(destination = QUEUE_NAME, containerFactory = "jmsListenerContainerFactory")
	    public void receiveMessage(String product) {
	        logger.info("Received message: {}", product);
	    }
}
