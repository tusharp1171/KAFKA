package com.exmple.supplier.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.exmple.supplier.constace.AppConstants;

@Service
public class TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public TestService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public boolean test(String msg) {
        kafkaTemplate.send(AppConstants.TOPIC_NAME, msg);
        logger.info("Message produced: {}", msg);
        return true;
    }
}
