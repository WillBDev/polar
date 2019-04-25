package org.kotoday.polar.types;

import org.kotoday.polar.Equation;

public class TypeA extends Equation {
    public TypeA() {
        super();
    }

    public String getEquation() {
       return super.genB() + super.getFunction() + "(0)";
    }
}
