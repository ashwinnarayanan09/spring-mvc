package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HomeController {

    @RequestMapping(value = "/", method = {RequestMethod.POST}, produces = "text/html")
    public void getConsent(HttpServletResponse httpServletResponse) throws IOException {

        System.out.println("authorize");

    }
}
