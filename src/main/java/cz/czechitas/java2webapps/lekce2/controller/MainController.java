package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class MainController {
    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView hodKostkou() {
        int nahodneCislo = random.nextInt(6) + 1;

        ModelAndView result = new ModelAndView("index");
        result.addObject("cislo", nahodneCislo);
        result.addObject("obrazek", String.format("/images/kostka-%d.svg", nahodneCislo));
        return result;
    }
}