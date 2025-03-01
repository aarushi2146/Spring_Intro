package com.example.MyFirstSpringProject;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloRestController {

    //http://localhost:8080/
    @RequestMapping("/")
    public String index(){
        return "hello from bridgeLabz!";
    }


    //localhost:8080/hello/query?name=Aarushi
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello "+ name +"from bridgeLabz!";
    }


    @GetMapping("/hello/param/{name}")
    public String sayHello1(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}
