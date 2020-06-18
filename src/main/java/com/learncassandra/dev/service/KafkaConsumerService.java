package com.learncassandra.dev.service;

import com.learncassandra.dev.model.Person;

public interface KafkaConsumerService {
    public void readMessage(Person person);
}
