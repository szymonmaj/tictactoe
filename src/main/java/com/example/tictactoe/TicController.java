package com.example.tictactoe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicController {
    @GetMapping("/")
    public String showForm(Model model) {
        TicActions ticActions = new TicActions();
        model.addAttribute("ticActions", ticActions);
        return "start";
    }

    @PostMapping("/")
    public String submitForm6(@ModelAttribute TicActions ticActions, @RequestParam(required = false) String name) {
        System.out.println(ticActions);
        if (name.equals("A1")){
            ticActions.a = "a";
            return "start";
        }
        if (name.equals("A2")){
            ticActions.a = "b";
            return "start";
        }
        if (name.equals("A3")) {
            ticActions.a = "c";
            return "start";
        }
        else {
            ticActions.a = "0";
            return "start";
        }
    }
}
