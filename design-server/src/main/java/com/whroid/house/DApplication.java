package com.whroid.house;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by whroid on 15/11/6.
 */

@EnableAutoConfiguration
@SpringBootApplication
public class DApplication {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DApplication.class, args);
        logger.error("dapplicatioin");

    }
}

