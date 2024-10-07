package com.controle.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzBuzz_de_1_devrait_retourner_1() {

        FizzBuzz fizz = new FizzBuzz();
        // GIVEN
        int fizznb = 1;
        // WHEN
        String resultat = fizz.de(fizznb);
        // THEN
        assertEquals("1", resultat);
    }

    @Test
    void fizzBuzz_de_2_devrait_retourner_2() {

        FizzBuzz fizz = new FizzBuzz();
        // GIVEN
        int fizznb = 2;
        // WHEN
        String resultat = fizz.de(fizznb);
        // THEN
        assertEquals("2", resultat);
    }

    @Test
    void fizzBuzz_de_3_devrait_retourner_Fizz() {

        FizzBuzz fizz = new FizzBuzz();
        // GIVEN
        int fizznb = 3;
        // WHEN
        String resultat = fizz.de(fizznb);
        // THEN
        assertEquals("Fizz", resultat);
    }

    @Test
    void fizzBuzz_de_5_devrait_retourner_Buzz() {

        FizzBuzz fizz = new FizzBuzz();
        // GIVEN
        int fizznb = 5;
        // WHEN
        String resultat = fizz.de(fizznb);
        // THEN
        assertEquals("Buzz", resultat);
    }

    @Test
    void fizzBuzz_de_15_devrait_retourner_FizzBuzz() {

        FizzBuzz fizz = new FizzBuzz();
        // GIVEN
        int fizznb = 15;
        // WHEN
        String resultat = fizz.de(fizznb);
        // THEN
        assertEquals("FizzBuzz", resultat);
    }
}
