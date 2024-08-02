package com.exmple.consumer.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.exmple.consumer.constant.AppConstants;


@Component
public class KapkaConfig {

    private static final Logger logger = LoggerFactory.getLogger(KapkaConfig.class);

    @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
    public void receiveMessage(String message) {
        try {
            // Process the received message
            logger.info("Received message: {}", message);
        } catch (Exception e) {
            // Handle any exceptions
            logger.error("Error while processing message: {}", message, e);
        }
    }
}