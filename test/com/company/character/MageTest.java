package com.company.character;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {
    Mage testMage;
    String originalName = "Test name";

    @BeforeEach
    void setUp() {
        testMage = new Mage(originalName);
    }

    @Test
    void correctLevelWhenCreated_ValidValue_ShouldPass() {
        int expected = 1;
        int result = testMage.getLevel();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void correctLevelUp_ValidValue_ShouldPass() {
        int expected = 2;

        testMage.levelUp();

        int result = testMage.getLevel();

        Assertions.assertEquals(expected, result);
    }
}