package com.rpsingh.web.saml.samlspringboot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}