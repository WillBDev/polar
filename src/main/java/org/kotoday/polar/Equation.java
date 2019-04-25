package org.kotoday.polar;

public class Equation {
    private String function = ((int) Math.round(Math.random()) == 1) ? "sin" : "cos";
    private int sign = ((int) Math.round(Math.random()) == 1) ? -1 : 1;
    protected int genA() {
        return sign * ((int) Math.round(Math.random() * 8) + 1);
    }

    protected int genB() {
        return sign * ((int) Math.round(Math.random() * 7) + 2);
    }

    protected int genC() {
        return (int) Math.round(Math.random() * 3) + 2;
    }

    protected String getFunction() {
        return function;
    }

    public String getEquation() {return null;}
}
