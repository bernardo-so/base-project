package bs.marketplace.api.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorld {

    @GetMapping
    fun helloWorld(): String {
        return "Hello World"
    }
}