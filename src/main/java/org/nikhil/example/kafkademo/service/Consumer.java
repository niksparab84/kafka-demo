package org.nikhil.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test-topic", groupId = "demo-topic-group")
    public void listenToTopic(String receivedMessage) {
        System.out.println("The message received is: " + receivedMessage);
    }

}
