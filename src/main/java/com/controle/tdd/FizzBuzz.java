package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbre) {
        for (int i = 0; i < nbre; i++) {
            if (nbre % 3 == 0) {
                return "Fizz";
            }
            if (nbre % 5 == 0) {
                return "Buzz";
            }
            else {
                return Integer.toString(nbre);
            }
        }
        return "Erreur";
    }
}
