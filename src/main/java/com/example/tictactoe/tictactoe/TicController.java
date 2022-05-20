package com.example.tictactoe.tictactoe;

import com.example.tictactoe.model.TicActions;
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
            if (!ticActions.xa.equals(" ")){
                return "start";
            }
            else {
                ticActions.xa = "X";
                if (!ticActions.xb.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xd.equals(" ") && !ticActions.xe.equals(" ") && !ticActions.xf.equals(" ") && !ticActions.xg.equals(" ") && !ticActions.xh.equals(" ") && !ticActions.xi.equals(" ")) {
                    return "start";
                }
                if (ticActions.xa.equals("X") && ticActions.xi.equals("X") && ticActions.xb.equals(" ") && ticActions.xd.equals(" ") && ticActions.xf.equals(" ") && ticActions.xg.equals(" ")) {
                    ticActions.xb = "O";
                    return "start";
                } else {
                    if (ticActions.xb.equals(" ") && ticActions.xc.equals(" ") && ticActions.xd.equals(" ") && ticActions.xe.equals(" ") && ticActions.xf.equals(" ") && ticActions.xg.equals(" ") && ticActions.xh.equals(" ") && ticActions.xi.equals(" ")) {
                        ticActions.xe = "O";
                        return "start";
                    } else {
                        if (ticActions.xb.equals("X") || ticActions.xc.equals("X") || ticActions.xd.equals("X") || ticActions.xg.equals("X")) {
                            if (ticActions.xb.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
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
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xc.equals("X")) {
                                if (ticActions.xb.equals(" ")) {
                                    ticActions.xb = "O";
                                    return "start";
                                } else {
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
                                    } else {
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
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xd.equals(" ")) {
                                    ticActions.xd = "O";
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
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                        } else {
                            if (ticActions.xe.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
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
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xi.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
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
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xf.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
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
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
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
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (name.equals("A2")){
            if (!ticActions.xb.equals(" ")){
                return "start";
            }
            else {
                ticActions.xb = "X";
                if (!ticActions.xa.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xd.equals(" ") && !ticActions.xe.equals(" ") && !ticActions.xf.equals(" ") && !ticActions.xg.equals(" ") && !ticActions.xh.equals(" ") && !ticActions.xi.equals(" ")) {
                    return "start";
                } else {
                    if (ticActions.xa.equals(" ") && ticActions.xc.equals(" ") && ticActions.xd.equals(" ") && ticActions.xe.equals(" ") && ticActions.xf.equals(" ") && ticActions.xg.equals(" ") && ticActions.xh.equals(" ") && ticActions.xi.equals(" ")) {
                        ticActions.xe = "O";
                        return "start";
                    } else {
                        if (ticActions.xa.equals("X") || ticActions.xc.equals("X") || ticActions.xd.equals("X") || ticActions.xg.equals("X")) {
                            if (ticActions.xa.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
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
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xc.equals("X")) {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
                                    return "start";
                                } else {
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
                                    } else {
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
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
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
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                        } else {
                            if (ticActions.xe.equals("X")) {
                                if (ticActions.xh.equals(" ")) {
                                    ticActions.xh = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xi.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xf.equals("X")) {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (name.equals("A3")) {
            if (!ticActions.xc.equals(" ")){
                return "start";
            }
            else {
                ticActions.xc = "X";
                if (!ticActions.xa.equals(" ") && !ticActions.xb.equals(" ") && !ticActions.xd.equals(" ") && !ticActions.xe.equals(" ") && !ticActions.xf.equals(" ") && !ticActions.xg.equals(" ") && !ticActions.xh.equals(" ") && !ticActions.xi.equals(" ")) {
                    return "start";
                }
                if (ticActions.xc.equals("X") && ticActions.xg.equals("X") && ticActions.xb.equals(" ") && ticActions.xd.equals(" ") && ticActions.xf.equals(" ") && ticActions.xh.equals(" ")) {
                    ticActions.xh = "O";
                    return "start";
                } else {
                    if (ticActions.xa.equals(" ") && ticActions.xb.equals(" ") && ticActions.xd.equals(" ") && ticActions.xe.equals(" ") && ticActions.xf.equals(" ") && ticActions.xg.equals(" ") && ticActions.xh.equals(" ") && ticActions.xi.equals(" ")) {
                        ticActions.xe = "O";
                        return "start";
                    } else {
                        if (ticActions.xa.equals("X") || ticActions.xb.equals("X") || ticActions.xd.equals("X") || ticActions.xg.equals("X")) {
                            if (ticActions.xa.equals("X")) {
                                if (ticActions.xb.equals(" ")) {
                                    ticActions.xb = "O";
                                    return "start";
                                } else {
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
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xb.equals("X")) {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xd.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
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
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                        } else {
                            if (ticActions.xe.equals("X")) {
                                if (ticActions.xg.equals(" ")) {
                                    ticActions.xg = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xi.equals("X")) {
                                if (ticActions.xf.equals(" ")) {
                                    ticActions.xf = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
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
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xf.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
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
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (name.equals("B1")){
            if (!ticActions.xd.equals(" ")){
                return "start";
            }
            else {
                ticActions.xd = "X";
                if (!ticActions.xa.equals(" ") && !ticActions.xb.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xe.equals(" ") && !ticActions.xf.equals(" ") && !ticActions.xg.equals(" ") && !ticActions.xh.equals(" ") && !ticActions.xi.equals(" ")) {
                    return "start";
                } else {
                    if (ticActions.xa.equals(" ") && ticActions.xb.equals(" ") && ticActions.xc.equals(" ") && ticActions.xe.equals(" ") && ticActions.xf.equals(" ") && ticActions.xg.equals(" ") && ticActions.xh.equals(" ") && ticActions.xi.equals(" ")) {
                        ticActions.xe = "O";
                        return "start";
                    } else {
                        if (ticActions.xa.equals("X") || ticActions.xb.equals("X") || ticActions.xc.equals("X") || ticActions.xg.equals("X")) {
                            if (ticActions.xa.equals("X")) {
                                if (ticActions.xg.equals(" ")) {
                                    ticActions.xg = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xb.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xc.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
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
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
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
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            }
                        } else {
                            if (ticActions.xe.equals("X")) {
                                if (ticActions.xf.equals(" ")) {
                                    ticActions.xf = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
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
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    } else {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xi.equals("X")) {
                                if (ticActions.xf.equals(" ")) {
                                    ticActions.xf = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xf.equals("X")) {
                                if (ticActions.xg.equals(" ")) {
                                    ticActions.xg = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (name.equals("B2")) {
            if (!ticActions.xe.equals(" ")){
                return "start";
            }
            else {
                ticActions.xe = "X";
                if (!ticActions.xa.equals(" ") && !ticActions.xb.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xd.equals(" ") && !ticActions.xf.equals(" ") && !ticActions.xg.equals(" ") && !ticActions.xh.equals(" ") && !ticActions.xi.equals(" ")) {
                    return "start";
                } else {
                    ticActions.xa = "O";
                    return "start";
                }
            }
        }
        if (name.equals("B3")) {
            if (!ticActions.xf.equals(" ")){
                return "start";
            }
            else {
                ticActions.xf = "X";
                if (!ticActions.xa.equals(" ") && !ticActions.xb.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xd.equals(" ") && !ticActions.xe.equals(" ") && !ticActions.xg.equals(" ") && !ticActions.xh.equals(" ") && !ticActions.xi.equals(" ")) {
                    return "start";
                } else {
                    if (ticActions.xa.equals(" ") && ticActions.xb.equals(" ") && ticActions.xc.equals(" ") && ticActions.xd.equals(" ") && ticActions.xe.equals(" ") && ticActions.xg.equals(" ") && ticActions.xh.equals(" ") && ticActions.xi.equals(" ")) {
                        ticActions.xe = "O";
                        return "start";
                    } else {
                        if (ticActions.xa.equals("X") || ticActions.xb.equals("X") || ticActions.xc.equals("X") || ticActions.xg.equals("X")) {
                            if (ticActions.xa.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xb.equals("X")) {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
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
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xc.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                }
                            }
                        } else {
                            if (ticActions.xe.equals("X")) {
                                if (ticActions.xd.equals(" ")) {
                                    ticActions.xd = "O";
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
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xi.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
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
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    } else {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xd.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    } else {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (name.equals("C1")){
            if (!ticActions.xg.equals(" ")){
                return "start";
            }
            else {
                ticActions.xg = "X";
                if (!ticActions.xa.equals(" ") && !ticActions.xb.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xe.equals(" ") && !ticActions.xf.equals(" ") && !ticActions.xh.equals(" ") && !ticActions.xi.equals(" ")) {
                    return "start";
                }
                if (ticActions.xc.equals("X") && ticActions.xg.equals("X") && ticActions.xb.equals(" ") && ticActions.xd.equals(" ") && ticActions.xf.equals(" ") && ticActions.xh.equals(" ")) {
                    ticActions.xd = "O";
                    return "start";
                } else {
                    if (ticActions.xa.equals(" ") && ticActions.xb.equals(" ") && ticActions.xc.equals(" ") && ticActions.xd.equals(" ") && ticActions.xe.equals(" ") && ticActions.xf.equals(" ") && ticActions.xh.equals(" ") && ticActions.xi.equals(" ")) {
                        ticActions.xe = "O";
                        return "start";
                    } else {
                        if (ticActions.xi.equals("X") || ticActions.xh.equals("X") || ticActions.xa.equals("X") || ticActions.xd.equals("X")) {
                            if (ticActions.xi.equals("X")) {
                                if (ticActions.xh.equals(" ")) {
                                    ticActions.xh = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xh.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xa.equals("X")) {
                                if (ticActions.xd.equals(" ")) {
                                    ticActions.xd = "O";
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
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
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
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    } else {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                }
                            }
                        } else {
                            if (ticActions.xe.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xb.equals("X")) {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
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
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xf.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
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
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    } else {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (name.equals("C2")){
            if (!ticActions.xh.equals(" ")){
                return "start";
            }
            else {
                ticActions.xh = "X";
                if (!ticActions.xa.equals(" ") && !ticActions.xb.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xd.equals(" ") && !ticActions.xe.equals(" ") && !ticActions.xf.equals(" ") && !ticActions.xg.equals(" ") && !ticActions.xi.equals(" ")) {
                    return "start";
                } else {
                    if (ticActions.xa.equals(" ") && ticActions.xb.equals(" ") && ticActions.xc.equals(" ") && ticActions.xd.equals(" ") && ticActions.xe.equals(" ") && ticActions.xf.equals(" ") && ticActions.xg.equals(" ") && ticActions.xi.equals(" ")) {
                        ticActions.xe = "O";
                        return "start";
                    } else {
                        if (ticActions.xa.equals("X") || ticActions.xb.equals("X") || ticActions.xc.equals("X") || ticActions.xg.equals("X")) {
                            if (ticActions.xa.equals("X")) {
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
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xb.equals("X")) {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xc.equals("X")) {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
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
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xi.equals(" ")) {
                                    ticActions.xi = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
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
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                        } else {
                            if (ticActions.xe.equals("X")) {
                                if (ticActions.xb.equals(" ")) {
                                    ticActions.xb = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xi.equals("X")) {
                                if (ticActions.xg.equals(" ")) {
                                    ticActions.xg = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xf.equals("X")) {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xi.equals(" ")) {
                                        ticActions.xi = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (name.equals("C3")) {
            if (!ticActions.xi.equals(" ")){
                return "start";
            }
            else {
                ticActions.xi = "X";
                if (!ticActions.xa.equals(" ") && !ticActions.xb.equals(" ") && !ticActions.xc.equals(" ") && !ticActions.xd.equals(" ") && !ticActions.xe.equals(" ") && !ticActions.xf.equals(" ") && !ticActions.xg.equals(" ") && !ticActions.xh.equals(" ")) {
                    return "start";
                }
                if (ticActions.xa.equals("X") && ticActions.xi.equals("X") && ticActions.xb.equals(" ") && ticActions.xd.equals(" ") && ticActions.xf.equals(" ") && ticActions.xh.equals(" ")) {
                    ticActions.xb = "O";
                    return "start";
                } else {
                    if (ticActions.xa.equals(" ") && ticActions.xb.equals(" ") && ticActions.xc.equals(" ") && ticActions.xd.equals(" ") && ticActions.xe.equals(" ") && ticActions.xf.equals(" ") && ticActions.xg.equals(" ") && ticActions.xh.equals(" ")) {
                        ticActions.xe = "O";
                        return "start";
                    } else {
                        if (ticActions.xc.equals("X") || ticActions.xf.equals("X") || ticActions.xh.equals("X") || ticActions.xg.equals("X")) {
                            if (ticActions.xc.equals("X")) {
                                if (ticActions.xf.equals(" ")) {
                                    ticActions.xf = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xf.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xh.equals("X")) {
                                if (ticActions.xg.equals(" ")) {
                                    ticActions.xg = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xh.equals(" ")) {
                                    ticActions.xh = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            }
                        } else {
                            if (ticActions.xe.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xa.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    }
                                    if (ticActions.xb.equals(" ")) {
                                        ticActions.xb = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            }
                            if (ticActions.xb.equals("X")) {
                                if (ticActions.xc.equals(" ")) {
                                    ticActions.xc = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xa.equals(" ")) {
                                        ticActions.xa = "O";
                                        return "start";
                                    }
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                    if (ticActions.xh.equals(" ")) {
                                        ticActions.xh = "O";
                                        return "start";
                                    } else {
                                        ticActions.xd = "O";
                                        return "start";
                                    }
                                }
                            } else {
                                if (ticActions.xa.equals(" ")) {
                                    ticActions.xa = "O";
                                    return "start";
                                } else {
                                    if (ticActions.xc.equals(" ")) {
                                        ticActions.xc = "O";
                                        return "start";
                                    }
                                    if (ticActions.xg.equals(" ")) {
                                        ticActions.xg = "O";
                                        return "start";
                                    }
                                    if (ticActions.xf.equals(" ")) {
                                        ticActions.xf = "O";
                                        return "start";
                                    }
                                    if (ticActions.xd.equals(" ")) {
                                        ticActions.xd = "O";
                                        return "start";
                                    } else {
                                        ticActions.xb = "O";
                                        return "start";
                                    }
                                }
                            }
                        }
                    }
                }
            }
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
    }
}
