package com.mbproject.KafkaJsonObject.Listener;

import com.mbproject.KafkaJsonObject.model.UserModel;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "mytopic",groupId = "group_id")
    public void consume(String message){
        System.out.println("Kafka Consume String msg :- "+message);
    }

    @KafkaListener(topics = "mytopic2",groupId = "group_id2", containerFactory = "kafkaListenerJsonContainerFactory")
    public void consumeJson(UserModel userMsg){
        System.out.println("Kafka Consumer Json msg :- "+userMsg);
    }
}
