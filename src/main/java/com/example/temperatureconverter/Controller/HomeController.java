package com.example.temperatureconverter.Controller;

import com.example.temperatureconverter.Degree;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, params = "C2F")
    public String C2F(@ModelAttribute Degree degree, Model model) {
        model.addAttribute("convertedDegree", degree.getC2F());

        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, params = "F2C")
    public String F2C(@ModelAttribute Degree degree, Model model) {
        model.addAttribute("convertedDegree", degree.getF2C());

        return "index";
    }
}
