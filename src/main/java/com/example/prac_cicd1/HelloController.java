package com.example.prac_cicd1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hi")
    public String hi(){
        return "hi cicd  prac1 ^^ !!!!!!!!!^^^ !!!! !! %%%%%";
    }


}
