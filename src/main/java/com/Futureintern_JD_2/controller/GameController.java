package com.Futureintern_JD_2.controller;

import com.Futureintern_JD_2.model.Game;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {
    private final Game game = new Game();

    @GetMapping("/")
    public String showGameForm(Model model) {
        model.addAttribute("game", game);
        return "index";
    }

    @PostMapping("/play")
    public String playGame(@RequestParam String userChoice, Model model) {
        game.setUserChoice(userChoice);
        model.addAttribute("game", game);
        return "index";
    }
}
