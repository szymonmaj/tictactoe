package com.example.tictactoe;

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
        if (xa.equals("O") && xb.equals("O") && xc.equals("O") || xd.equals("O") && xe.equals("O") && xf.equals("O") || xg.equals("O") && xh.equals("O") && xi.equals("O") || xa.equals("O") && xe.equals("O") && xi.equals("O") || xc.equals("O") && xe.equals("O") && xg.equals("O")){
            kom = "Game over, O win";
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

    public static String getXa() {
        return xa;
    }

    public static void setXa(String xa) {
        TicActions.xa = xa;
    }

    public static String getXb() {
        return xb;
    }

    public static void setXb(String xb) {
        TicActions.xb = xb;
    }

    public static String getXc() {
        return xc;
    }

    public static void setXc(String xc) {
        TicActions.xc = xc;
    }

    public String getXd() {
        return xd;
    }

    public void setXd(String xd) {
        this.xd = xd;
    }

    public String getXe() {
        return xe;
    }

    public void setXe(String xe) {
        this.xe = xe;
    }

    public String getXf() {
        return xf;
    }

    public void setXf(String xf) {
        this.xf = xf;
    }

    public String getXg() {
        return xg;
    }

    public void setXg(String xg) {
        this.xg = xg;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getXi() {
        return xi;
    }

    public void setXi(String xi) {
        this.xi = xi;
    }

}
