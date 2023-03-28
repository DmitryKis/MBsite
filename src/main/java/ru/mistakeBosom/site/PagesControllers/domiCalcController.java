package ru.mistakeBosom.site.PagesControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class domiCalcController {
    @Controller
    @RequestMapping("/calcDominika")
    public class calcForm {

        @GetMapping
        public String get(Model model) {
            return "calcForm";
        }
    }
}
