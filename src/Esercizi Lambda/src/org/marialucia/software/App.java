package org.marialucia.software;

import java.util.function.Predicate;

//uso dell'interfaccia Predicate e suoi metodi con espressioni lambda

class Persona {
    private int eta;

    public Persona(int eta) {
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }
}

public class App {
    public static void main(String[] args) {
        Predicate<Persona> adulto = p -> p.getEta() >= 18;
        Predicate<Persona> anziano = p -> p.getEta() >= 65;

        Predicate<Persona> adultoNonAnziano = adulto.and(anziano.negate());

        Persona p1 = new Persona(20);
        Persona p2 = new Persona(70);

        System.out.println(adultoNonAnziano.test(p1));
        System.out.println(adultoNonAnziano.test(p2));
    }
}