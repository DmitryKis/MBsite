package ru.mistakeBosom.site.PagesControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



    @Controller
    @RequestMapping("/test")
    public class testController {

        @GetMapping
        public String get(Model model) {
            return "testPage";
        }
    }

