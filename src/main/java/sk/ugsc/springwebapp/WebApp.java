package sk.ugsc.springwebapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class WebApp {

}

@Component
class TestClass {
    public String test() {
        return "Sterace stiraji";
    }
}
