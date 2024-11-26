package amo11k.com.track_my_gaming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "¡Hola desde el backend!";
    }

}
