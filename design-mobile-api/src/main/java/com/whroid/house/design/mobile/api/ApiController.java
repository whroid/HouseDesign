package com.whroid.house.design.mobile.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by whroid on 15/11/6.
 */

@Controller
public class ApiController {
    private static final Logger logger = LogManager.getLogger();

    @RequestMapping("/api")
    public @ResponseBody String home() {
        return "Hello api!";
    }

}
