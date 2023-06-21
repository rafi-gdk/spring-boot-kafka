package com.sonu.kafka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    KafkaTemplate<String, String> template;

    @GetMapping("/publishMessage/{message}")
    public String publishMessage(@PathVariable("message") String message) {
        template.send("my-topic", message);
        return "Success";
    }
}