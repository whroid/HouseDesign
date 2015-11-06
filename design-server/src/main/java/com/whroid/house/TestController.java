package com.whroid.house;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by whroid on 15/11/6.
 */

@Controller
public class TestController {
    private static final Logger logger = LogManager.getLogger();

    @RequestMapping("/test")
    public @ResponseBody String home() {
        return "Hello test!";
    }

}
