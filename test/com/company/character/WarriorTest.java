package com.company.character;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    Warrior testWarrior;
    String originalName = "Test name";

    @BeforeEach
    void setUp() {
        testWarrior = new Warrior(originalName);
    }

    @Test
    void correctLevelWhenCreated_ValidValue_ShouldPass() {
        int expected = 1;
        int result = testWarrior.getLevel();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void correctLevelWhenLevelUp_ValidValue_ShouldPass() {
        int expected = 2;

        testWarrior.levelUp();

        int result = testWarrior.getLevel();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void correctAttributesWhenCreated_ValidValue_ShouldPass() {
        int expectedStrength = 5;
        int expectedDexterity = 2;
        int expectedIntelligence = 1;

        int strengthResult = testWarrior.getStrength();
        int dexterityResult = testWarrior.getDexterity();
        int intelligenceResult = testWarrior.getIntelligence();

        Assertions.assertEquals(expectedStrength, strengthResult);
        Assertions.assertEquals(expectedDexterity, dexterityResult);
        Assertions.assertEquals(expectedIntelligence, intelligenceResult);
    }

    @Test
    void correctAttributesWhenLevelUp_ValidValue_ShouldPass() {
        int expectedStrength = 8;
        int expectedDexterity = 4;
        int expectedIntelligence = 2;

        testWarrior.levelUp();

        int strengthResult = testWarrior.getStrength();
        int dexterityResult = testWarrior.getDexterity();
        int intelligenceResult = testWarrior.getIntelligence();

        Assertions.assertEquals(expectedStrength, strengthResult);
        Assertions.assertEquals(expectedDexterity, dexterityResult);
        Assertions.assertEquals(expectedIntelligence, intelligenceResult);
    }
}