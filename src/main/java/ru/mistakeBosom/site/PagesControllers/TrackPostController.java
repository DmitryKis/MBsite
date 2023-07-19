package ru.mistakeBosom.site.PagesControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class TrackPostController {

    @GetMapping
    public String showForm(Model model) {
        //String formUrl = "https://docs.google.com/forms/d/e/1FAIpQLSe4-SIPjJBQdufTa9MnmgcFu3aOkAiSHWM9ZwW_RKJX0wnurQ/viewform";
        //model.addAttribute("formUrl", formUrl);
        return "TrackPostPage";
    }
}
