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
        System.out.println(name);

        if (name.equals("A1")){
            ticActions.xa = "X";
            if (!ticActions.xb.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xd.equals(" ") && !ticActions.xe.equals(" ") && !ticActions.xf.equals(" ") && !ticActions.xg.equals(" ") && !ticActions.xh.equals(" ") && !ticActions.xi.equals(" ")){
                return "start";
            }
                else {
                    if (ticActions.xb.equals(" ") && ticActions.xc.equals(" ") && ticActions.xd.equals(" ") && ticActions.xe.equals(" ") && ticActions.xf.equals(" ") && ticActions.xg.equals(" ") && ticActions.xh.equals(" ") && ticActions.xi.equals(" ")){
                        ticActions.xe = "O";
                        return "start";
                        }
                        else {
                            if (ticActions.xb.equals("X") || ticActions.xc.equals("X") || ticActions.xd.equals("X") || ticActions.xg.equals("X")) {
                                if (ticActions.xb.equals("X")){
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    else {
                                        if (ticActions.xi.equals(" ")) {
                                            ticActions.xi = "O";
                                            return "start";
                                        }
                                        if (ticActions.xg.equals(" ")) {
                                            ticActions.xg = "O";
                                            return "start";
                                        }
                                        if (ticActions.xd.equals(" ")) {
                                            ticActions.xd = "O";
                                            return "start";
                                        }
                                        if (ticActions.xh.equals(" ")) {
                                            ticActions.xh = "O";
                                            return "start";
                                        }
                                        else {
                                            ticActions.xf = "O";
                                            return "start";
                                        }
                                    }
                                }
                                if (ticActions.xc.equals("X")){
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                    else {
                                        if (ticActions.xi.equals(" ")) {
                                            ticActions.xi = "O";
                                            return "start";
                                        }
                                        if (ticActions.xg.equals(" ")) {
                                            ticActions.xg = "O";
                                            return "start";
                                        }
                                        if (ticActions.xd.equals(" ")) {
                                            ticActions.xd = "O";
                                            return "start";
                                        }
                                        if (ticActions.xh.equals(" ")) {
                                            ticActions.xh = "O";
                                            return "start";
                                        }
                                        else {
                                            ticActions.xf = "O";
                                            return "start";
                                        }
                                    }
                                }
                                if (ticActions.xd.equals("X")) {
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    } else {
                                        if (ticActions.xi.equals(" ")) {
                                            ticActions.xi = "O";
                                            return "start";
                                        }
                                        if (ticActions.xc.equals(" ")) {
                                            ticActions.xc = "O";
                                            return "start";
                                        }
                                        if (ticActions.xb.equals(" ")) {
                                            ticActions.xb = "O";
                                            return "start";
                                        }
                                        if (ticActions.xh.equals(" ")) {
                                            ticActions.xh = "O";
                                            return "start";
                                        }
                                        else {
                                            ticActions.xf = "O";
                                            return "start";
                                        }
                                    }
                                }
                                        else {
                                            if (ticActions.xd.equals(" ")) {
                                                ticActions.xd = "O";
                                                return "start";
                                            }
                                            else {
                                                if (ticActions.xi.equals(" ")) {
                                                    ticActions.xi = "O";
                                                    return "start";
                                                }
                                                if (ticActions.xc.equals(" ")) {
                                                    ticActions.xc = "O";
                                                    return "start";
                                                }
                                                if (ticActions.xb.equals(" ")) {
                                                    ticActions.xb = "O";
                                                    return "start";
                                                }
                                                if (ticActions.xh.equals(" ")) {
                                                    ticActions.xh = "O";
                                                    return "start";
                                                }
                                                else {
                                                    ticActions.xf = "O";
                                                    return "start";
                                                }
                                            }
                                        }
                            }
                            else {
                                if (ticActions.xe.equals("X")){
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    else {
                                        if (ticActions.xc.equals(" ")) {
                                            ticActions.xc = "O";
                                            return "start";
                                        }
                                        if (ticActions.xg.equals(" ")) {
                                            ticActions.xg = "O";
                                            return "start";
                                        }
                                        if (ticActions.xb.equals(" ")) {
                                            ticActions.xb = "O";
                                            return "start";
                                        }
                                        if (ticActions.xd.equals(" ")) {
                                            ticActions.xd = "O";
                                            return "start";
                                        }
                                        if (ticActions.xh.equals(" ")) {
                                            ticActions.xh = "O";
                                            return "start";
                                        }
                                        else {
                                            ticActions.xf = "O";
                                            return "start";
                                        }
                                    }
                                }
                                if (ticActions.xi.equals("X")){
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    else {
                                        if (ticActions.xg.equals(" ")) {
                                            ticActions.xg = "O";
                                            return "start";
                                        }
                                        if (ticActions.xb.equals(" ")) {
                                            ticActions.xb = "O";
                                            return "start";
                                        }
                                        if (ticActions.xd.equals(" ")) {
                                            ticActions.xd = "O";
                                            return "start";
                                        }
                                        if (ticActions.xh.equals(" ")) {
                                            ticActions.xh = "O";
                                            return "start";
                                        }
                                        else {
                                            ticActions.xf = "O";
                                            return "start";
                                        }
                                    }
                                }
                                if (ticActions.xf.equals("X")) {
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    else {
                                        if (ticActions.xc.equals(" ")) {
                                            ticActions.xc = "O";
                                            return "start";
                                        }
                                        if (ticActions.xg.equals(" ")) {
                                            ticActions.xg = "O";
                                            return "start";
                                        }
                                        if (ticActions.xb.equals(" ")) {
                                            ticActions.xb = "O";
                                            return "start";
                                        }
                                        if (ticActions.xd.equals(" ")) {
                                            ticActions.xd = "O";
                                            return "start";
                                        }
                                        else {
                                            ticActions.xh = "O";
                                            return "start";
                                        }
                                    }
                                }
                                else {
                                        if (ticActions.xi.equals(" ")) {
                                            ticActions.xi = "O";
                                            return "start";
                                        }
                                        else {
                                            if (ticActions.xc.equals(" ")) {
                                                ticActions.xc = "O";
                                                return "start";
                                            }
                                            if (ticActions.xg.equals(" ")) {
                                                ticActions.xg = "O";
                                                return "start";
                                            }
                                            if (ticActions.xb.equals(" ")) {
                                                ticActions.xb = "O";
                                                return "start";
                                            }
                                            if (ticActions.xd.equals(" ")) {
                                                ticActions.xd = "O";
                                                return "start";
                                            }
                                            else {
                                                ticActions.xf = "O";
                                                return "start";
                                            }
                                        }
                                }
                            }
                    }
            }
        }
        if (name.equals("A2")){
            ticActions.xb = "X";
            return "start";
        }
        if (name.equals("A3")) {
            ticActions.xc = "X";
            return "start";
        }
        if (name.equals("B1")){
            ticActions.xd = "X";
            return "start";
        }
        if (name.equals("B2")){
            ticActions.xe = "X";
            return "start";
        }
        if (name.equals("B3")) {
            ticActions.xf = "X";
            return "start";
        }
        if (name.equals("C1")){
            ticActions.xg = "X";
            return "start";
        }
        if (name.equals("C2")){
            ticActions.xh = "X";
            return "start";
        }
        if (name.equals("C3")) {
            ticActions.xi = "X";
            return "start";
        }
        else  {
            ticActions.xa = " ";
            ticActions.xb = " ";
            ticActions.xc = " ";
            ticActions.xd = " ";
            ticActions.xe = " ";
            ticActions.xf = " ";
            ticActions.xg = " ";
            ticActions.xh = " ";
            ticActions.xi = " ";
            return "start";
        }
//        else {
//            ticActions.xi = "y";
//            return "start";
//        }
//        return name;
    }
}
