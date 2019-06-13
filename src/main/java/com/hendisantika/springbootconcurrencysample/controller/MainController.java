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

    @RequestMapping(value = "/callKotlin")
    public String callKotlin() {

        return kotlinBean.helloKotlin("Hello Kotlin");
    }

}
