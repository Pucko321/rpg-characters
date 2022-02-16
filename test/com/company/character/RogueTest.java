package com.company.character;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {
    Rogue testRogue;
    String originalName = "Test name";

    @BeforeEach
    void setUp() {
        testRogue = new Rogue(originalName);
    }

    @Test
    void correctLevelWhenCreated_ValidValue_ShouldPass() {
        int expected = 1;
        int result = testRogue.getLevel();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void correctLevelWhenLevelUp_ValidValue_ShouldPass() {
        int expected = 2;

        testRogue.levelUp();

        int result = testRogue.getLevel();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void correctAttributesWhenCreated_ValidValue_ShouldPass() {
        int expectedStrength = 2;
        int expectedDexterity = 6;
        int expectedIntelligence = 1;

        int strengthResult = testRogue.getStrength();
        int dexterityResult = testRogue.getDexterity();
        int intelligenceResult = testRogue.getIntelligence();

        Assertions.assertEquals(expectedStrength, strengthResult);
        Assertions.assertEquals(expectedDexterity, dexterityResult);
        Assertions.assertEquals(expectedIntelligence, intelligenceResult);
    }

    @Test
    void correctAttributesWhenLevelUp_ValidValue_ShouldPass() {
        int expectedStrength = 3;
        int expectedDexterity = 10;
        int expectedIntelligence = 2;

        testRogue.levelUp();

        int strengthResult = testRogue.getStrength();
        int dexterityResult = testRogue.getDexterity();
        int intelligenceResult = testRogue.getIntelligence();

        Assertions.assertEquals(expectedStrength, strengthResult);
        Assertions.assertEquals(expectedDexterity, dexterityResult);
        Assertions.assertEquals(expectedIntelligence, intelligenceResult);
    }
}