package com.example.tictactoe.model;

public class TicActions {
    public static String xa = " ";
    public static String xb = " ";
    public static String xc = " ";
    public static String xd = " ";
    public static String xe = " ";
    public static String xf = " ";
    public static String xg = " ";
    public static String xh = " ";
    public static String xi = " ";
    public String kom;

    public String sprawdzenie(){
        if (xa.equals("O") && xb.equals("O") && xc.equals("O") || xd.equals("O") && xe.equals("O") && xf.equals("O") || xg.equals("O") && xh.equals("O") && xi.equals("O") || xa.equals("O") && xe.equals("O") && xi.equals("O") || xc.equals("O") && xe.equals("O") && xg.equals("O") || xa.equals("O") && xd.equals("O") && xg.equals("O") || xb.equals("O") && xe.equals("O") && xh.equals("O") || xc.equals("O") && xf.equals("O") && xi.equals("O")){
            kom = "Game over, O win";
        }
        if (xa.equals("X") && xb.equals("X") && xc.equals("X") || xd.equals("X") && xe.equals("X") && xf.equals("X") || xg.equals("X") && xh.equals("X") && xi.equals("X") || xa.equals("X") && xe.equals("X") && xi.equals("X") || xc.equals("X") && xe.equals("X") && xg.equals("X") || xa.equals("X") && xd.equals("X") && xg.equals("X") || xb.equals("X") && xe.equals("X") && xh.equals("X") || xc.equals("X") && xf.equals("X") && xi.equals("X")){
            kom = "Game over, X win";
            return kom;
        }
        if (!xa.equals(" ") && !xb.equals(" ") && !xc.equals(" ") && !xd.equals(" ") && !xe.equals(" ") && !xf.equals(" ") && !xg.equals(" ") && !xh.equals(" ") && !xi.equals(" ")) {
            kom = "DRAW";
        }
        return kom;
    }

    public String getKom() {
        return kom;
    }

    public void setKom(String kom) {
        this.kom = kom;
    }
}
