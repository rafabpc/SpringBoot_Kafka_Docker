package com.application.controller;

import com.application.service.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    @Autowired
    private KafkaSender kafkaSender;

    @RequestMapping(value = "/kafka_message", method = RequestMethod.GET)
    public @ResponseBody
    String kafkaMessage(@RequestParam("message") String message) {
        kafkaSender.send(message);
        return "Message sent to Kafka: " + message;
    }

}
