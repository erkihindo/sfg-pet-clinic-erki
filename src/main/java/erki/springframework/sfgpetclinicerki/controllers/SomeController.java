package erki.springframework.sfgpetclinicerki.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
@Primary
public class SomeController {

    public String hello() {
        System.out.println("hello");
        return "Hello";
    }
}
