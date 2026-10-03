package com.darshan.darshan_bhadja;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("abcd")
    public static String myMethod() {
        return "<h1>AB1fghhethtyyt234CD</h1>";


    }
}
