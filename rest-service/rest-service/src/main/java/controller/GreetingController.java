package controller;

import model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name") String name){
        return new Greeting(counter.incrementAndGet(), name);
    }

    /*
    the @GetMapping annotation maps the GET /greeting to the method greeting
    the @Request param takes the input value and gives it to the String name variable
     */
}
