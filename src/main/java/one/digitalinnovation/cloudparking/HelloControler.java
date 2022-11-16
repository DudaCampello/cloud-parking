package one.digitalinnovation.cloudparking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping
@ApiIgnore
public class HelloControler {
    @GetMapping
    public String hello(){

        return "Hello DIO. Java devs";
    }
}

