package in.lokesh.springboottesting.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {
    @GetMapping(value = "/get")
    public String get() {
        return "Hello World";
    }
}
