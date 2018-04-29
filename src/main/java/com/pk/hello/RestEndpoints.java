package com.pk.hello;

import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class RestEndpoints {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "hello, world!";
    }

    @ApiOperation(value = "greeting", nickname = "hi", produces = APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public Greeting greet(@PathVariable("name") String name) {
        Greeting hi = new Greeting("hi", name);
        System.out.println(hi);
        return hi;
    }

    @Data
    public static final class Greeting {
        private final String greeting;
        private final String name;
    }
}
