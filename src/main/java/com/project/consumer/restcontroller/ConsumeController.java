package com.project.consumer.restcontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ConsumeController {


    @GetMapping("/getServerTime")
    public String getTime(){

        RestTemplate rT = new RestTemplate();
        String time = rT.getForObject("http://localhost:8081/getTime",String.class);
        return time;
    }

    @GetMapping("/getEnvDetails")
    public String getEnvDetails(){

        Map<String,String> envMap = System.getenv();

        return envMap.toString();
    }
}
