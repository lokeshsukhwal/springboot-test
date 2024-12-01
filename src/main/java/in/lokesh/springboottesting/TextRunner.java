package in.lokesh.springboottesting;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TextRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("from text runner");
    }
}
