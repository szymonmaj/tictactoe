package com.example.tictactoe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicController {
    @GetMapping("/")
    public String showForm() {
        return "start";
    }

}
