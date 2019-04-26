package org.kotoday.polar.types;

import org.kotoday.polar.PolarEquation;

public class TypeF extends PolarEquation {
    public TypeF() {
        super();
    }

    public String getEquation() {
        return  super.genB() + super.getFunction() + "(" + super.genC() + "0)";
    }

}
