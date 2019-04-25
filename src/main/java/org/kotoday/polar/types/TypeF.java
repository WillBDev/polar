package org.kotoday.polar.types;

import org.kotoday.polar.Equation;

public class TypeF extends Equation {
    public TypeF() {
        super();
    }

    public String getEquation() {
        return  super.genB() + super.getFunction() + "(" + super.genC() + "0)";
    }

}
