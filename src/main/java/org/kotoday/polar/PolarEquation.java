package org.kotoday.polar;

public abstract class PolarEquation {
    private int a, b, c;
    private String function = ((int) Math.round(Math.random()) == 1) ? "sin" : "cos";

    private int getSign() {
        return ((int) Math.round(Math.random()) == 1) ? -1 : 1;
    }

    protected int genA() {
        a = getSign() * ((int) Math.round(Math.random() * 8) + 1);
        return a;
    }

    protected int genB() {
        b = getSign() * ((int) Math.round(Math.random() * 7) + 2);
        return b;
    }

    protected int genC() {
        c = (int) Math.round(Math.random() * 3) + 2;
        ;
        return c;
    }

    protected String getFunction() {
        return function;
    }

    protected abstract String getEquation();


}
