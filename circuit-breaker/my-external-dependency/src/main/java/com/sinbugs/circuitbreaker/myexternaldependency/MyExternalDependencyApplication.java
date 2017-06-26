package com.sinbugs.circuitbreaker.myexternaldependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class MyExternalDependencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyExternalDependencyApplication.class, args);
    }
    
    @RequestMapping("/posts")
    @ResponseBody
    public String[] getPosts(){
        return new String[]{
            "Protegiendo tu aplicación de fallos externos con el patrón Circuit Breaker (Parte 2)",
            "Protegiendo tu aplicación de fallos externos con el patrón Circuit Breaker (Parte 1)",
            "Consejos para sacar provecho a tu log (Parte 2)",
            "Consejos para sacar provecho a tu log (Parte 1)",    
        };
    }
}