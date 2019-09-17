package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ThreadController {

    private Integer counter = 0;

    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public ResponseEntity<Integer> hello(HttpServletResponse httpServletResponse) throws InterruptedException {

        System.out.println("hello:"+Thread.currentThread().getName());
        Thread.sleep(10000);
        counter = counter + 1;
        return ResponseEntity.ok(counter);

    }
}
