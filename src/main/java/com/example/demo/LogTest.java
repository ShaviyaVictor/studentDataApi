package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LogTest {

    Logger logger = LoggerFactory.getLogger(LogTest.class);

    @RequestMapping("/")
    public String logTest() {
        logger.trace("Home method accessed!");
        logger.warn("Just to inform you!");
        logger.error("Just to inform you!");
        return "Yeah, The LogTest is working well!";
    }

}
