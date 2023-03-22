package com.example.temperatureconverter.Controller;

import com.example.temperatureconverter.Degree;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
    public class HomeController {
        @GetMapping("/")
        public String index() {
            return "index";
        }

    @PostMapping("/C2F")
    public String C2F(@ModelAttribute Degree degree, Model model) {
        model.addAttribute("degree", degree.getStartDegree());
        model.addAttribute("convertedDegree", degree.getC2F());

        return "index";
    }

    @PostMapping("/F2C")
    public String F2C(@ModelAttribute Degree degree, Model model) {
        model.addAttribute("degree", degree.getStartDegree());
        model.addAttribute("convertedDegree", degree.getF2C());

        return "index";
    }
}
