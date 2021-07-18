package com.exercise.demo.controller;

import com.exercise.demo.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;


    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoker(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "Index";
    }

}
