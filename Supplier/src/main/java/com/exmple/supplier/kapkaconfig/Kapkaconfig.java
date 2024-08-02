package com.exmple.supplier.kapkaconfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.exmple.supplier.constace.AppConstants;


@Configuration
public class Kapkaconfig {

	@Bean
	public NewTopic newTopic() {
		return TopicBuilder
				.name(AppConstants.TOPIC_NAME)
//				.partitions()
//				.replicas()
				.build();
	}
}
