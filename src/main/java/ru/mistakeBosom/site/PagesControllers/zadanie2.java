package ru.mistakeBosom.site.PagesControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ru")
public class zadanie2 {

    @GetMapping
    public String get(Model model) {
        return "Zadanie2Salmon";
    }
}

