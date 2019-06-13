package com.hendisantika.springbootconcurrencysample.kotlin

import org.springframework.stereotype.Component
import java.util.concurrent.Callable

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-concurrency-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-14
 * Time: 04:18
 */
@Component
class KotlinBean {

    fun helloKotlin(param: String): String {
        println("A call from java to kotlin is being executed with param " + param)

        return "Hi From Kotlin"
    }


    fun <T> getCallable(task: Callable<T>): Callable<T> {
        return Callable {
            task.call()

        }
    }
}