package com.example.secondproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
   @RequestMapping("/")
    public String makeaperson(Model model) {
        Person x = new Person();

        x.setFirstName("Lala");
        x.setLastName("Stephen");
        x.setPhoneNumber("646-758-9937");
        x.setEmail("johnalex@email.com");
        model.addAttribute("myperson", x);
        return "index";


    }

}
