package org.kotoday.polar;

import org.kotoday.polar.types.*;

import java.util.ArrayList;
import java.util.Scanner;

public class PolarMachine {
    public static void main(String[] args) {
        ArrayList<String> generatedEquations = new ArrayList<String>();
        int tries = 0;
        final int maxAttempts = 200;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What type of equations are needed (Random, Circle, Cardiod, Limacon, Rose): \n");
        String type = scanner.nextLine();
        System.out.print("Enter how many questions are needed: \n");
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < n; i++) {
            String equation = fetchEquation(type);
            if (!generatedEquations.contains(equation)) {
                generatedEquations.add(equation);
                System.out.print((i + 1) + ". " + equation + "\n");
            } else {
                while (generatedEquations.contains(equation)) {
                    equation = fetchEquation(type);
                    tries++;
                    if (tries == maxAttempts) return;
                }
                tries = 0;
            }
        }
    }

    private static String fetchEquation(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return getCircle().getEquation();
        } else if (type.equalsIgnoreCase("limacon")) {
            return getLimacon().getEquation();
        } else if (type.equalsIgnoreCase("rose")) {
            return getRose().getEquation();
        } else if (type.equalsIgnoreCase("cardiod")) {
            return getCardiod().getEquation();
        } else {
            return getRandomEquation().getEquation();
        }
    }

    private static Equation getCircle() {
        return new TypeA();
    }

    private static Equation getRose() {
        return new TypeF();
    }

    private static Equation getCardiod() {
        return new TypeC();
    }

    private static Equation getLimacon() {
        Equation[] equations = new Equation[]{new TypeB(), new TypeD(), new TypeE()};
        return equations[(int) Math.round(Math.random() * (equations.length - 1))];
    }

    private static Equation getRandomEquation() {
        Equation[] equations = new Equation[]{new TypeA(), new TypeB(), new TypeC(), new TypeD(), new TypeE(), new TypeF()};
        return equations[(int) Math.round(Math.random() * (equations.length - 1))];
    }
}
