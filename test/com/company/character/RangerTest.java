package com.company.character;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangerTest {
    Ranger testRanger;
    String originalName = "Test name";

    @BeforeEach
    void setUp() {
        testRanger = new Ranger(originalName);
    }

    @Test
    void correctLevelWhenCreated_ValidValue_ShouldPass() {
        int expected = 1;
        int result = testRanger.getLevel();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void correctLevelWhenLevelUp_ValidValue_ShouldPass() {
        int expected = 2;

        testRanger.levelUp();

        int result = testRanger.getLevel();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void correctAttributesWhenCreated_ValidValue_ShouldPass() {
        int expectedStrength = 1;
        int expectedDexterity = 7;
        int expectedIntelligence = 1;

        int strengthResult = testRanger.getStrength();
        int dexterityResult = testRanger.getDexterity();
        int intelligenceResult = testRanger.getIntelligence();

        Assertions.assertEquals(expectedStrength, strengthResult);
        Assertions.assertEquals(expectedDexterity, dexterityResult);
        Assertions.assertEquals(expectedIntelligence, intelligenceResult);
    }

    @Test
    void correctAttributesWhenLevelUp_ValidValue_ShouldPass() {
        int expectedStrength = 2;
        int expectedDexterity = 12;
        int expectedIntelligence = 2;

        testRanger.levelUp();

        int strengthResult = testRanger.getStrength();
        int dexterityResult = testRanger.getDexterity();
        int intelligenceResult = testRanger.getIntelligence();

        Assertions.assertEquals(expectedStrength, strengthResult);
        Assertions.assertEquals(expectedDexterity, dexterityResult);
        Assertions.assertEquals(expectedIntelligence, intelligenceResult);
    }
}