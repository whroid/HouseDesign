package com.whroid.house.ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by whroid on 15/11/6.
 */

@Controller
public class SimpleController {
    private static final Logger logger = LogManager.getLogger();

    @RequestMapping("/helloworld")
    public String home(Map<String, Object> model) {
        return "/test";
    }

}
