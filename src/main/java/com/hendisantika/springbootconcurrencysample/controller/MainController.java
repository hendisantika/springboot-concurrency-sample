package com.hendisantika.springbootconcurrencysample.controller;

import com.hendisantika.springbootconcurrencysample.kotlin.KotlinBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-concurrency-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-14
 * Time: 04:19
 */
@RestController
public class MainController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    KotlinBean kotlinBean;

    @RequestMapping(value = "/main")
    public String getSuccess() {

        long start = 0, end = 0;

        System.out.println("Rest Call started .........." + (start = System.currentTimeMillis()));

        for (int i = 0; i < 10000; i++) {
            System.out.println(restTemplate.getForObject("http://localhost:8080/callKotlin", String.class));
        }

        System.out.println("Rest Call finished .........." + (end = System.currentTimeMillis()));

        System.out.println("Total time spent in seconds " + (end - start) / 1000);

        return "success";
    }

    @RequestMapping(value = "/callKotlin")
    public String callKotlin() {

        return kotlinBean.helloKotlin("Hello Kotlin");
    }

}
