package in.lokesh.springboottesting.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("greet")
public class GreetingController {

    @GetMapping("/hello")
    public String greet() {
        String name = "lokesh";
        return "Hello,"+name;
    }
}
