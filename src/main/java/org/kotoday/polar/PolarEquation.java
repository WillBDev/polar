package org.kotoday.polar;

public class PolarEquation {
    private String function = ((int) Math.round(Math.random()) == 1) ? "sin" : "cos";
    private int getSign() {
        return ((int) Math.round(Math.random()) == 1) ? -1 : 1;
    }
    protected int genA() {
        return getSign() * ((int) Math.round(Math.random() * 8) + 1);
    }

    protected int genB() {
        return getSign() * ((int) Math.round(Math.random() * 7) + 2);
    }

    protected int genC() {
        return (int) Math.round(Math.random() * 3) + 2;
    }

    protected String getFunction() {
        return function;
    }

    public String getEquation() {return null;}
}
