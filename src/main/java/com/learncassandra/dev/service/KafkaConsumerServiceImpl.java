package com.learncassandra.dev.service;

import com.learncassandra.dev.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {
    @Autowired
    private PersonService personService;
    @Override
    @KafkaListener(topics = "EXAMPLE_TOPIC", groupId = "example_topic_grp", containerFactory = "kafkaListenerContainerFactory")
    public void readMessage(Person person) {
        if(person != null) {
            System.out.println("Message arrived: " + person);
            personService.savePerson(person);
            System.out.println("Person Object saved to Cassandra DB.");
        }
    }
}
