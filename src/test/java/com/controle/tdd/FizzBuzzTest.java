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
}
