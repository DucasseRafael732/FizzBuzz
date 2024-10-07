package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbre) {
        for (int i = 0; i < nbre; i++) {
            if (nbre % 3 == 0) {
                return "Fizz";
            } else {
                return Integer.toString(nbre);
            }
        }
        return "Erreur";
    }
}
