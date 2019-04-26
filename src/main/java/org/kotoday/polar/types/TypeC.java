package org.kotoday.polar.types;

import org.kotoday.polar.PolarEquation;

public class TypeC extends PolarEquation {
    public TypeC() {
        super();
    }

    public String getEquation() {
        int a = super.genA(), b = super.genB();
        while (a / b == 1) {
            a = super.genA();
            b = super.genB();
        }
        String symbol = (b > 0) ? "+" : "";
        return a + symbol + b + super.getFunction() + "(0)";
    }

}
