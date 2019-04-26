package org.kotoday.polar.types;

import org.kotoday.polar.PolarEquation;

public class TypeA extends PolarEquation {
    public TypeA() {
        super();
    }

    public String getEquation() {
       return super.genB() + super.getFunction() + "(0)";
    }
}
