package com.company.character;

import com.company.PrimaryAttribute;
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

    @Test
    void correctAttributesWhenCreated_ValidValue_ShouldPass() {
        int expectedStrength = 1;
        int expectedDexterity = 1;
        int expectedIntelligence = 8;

        int strengthResult = testMage.getStrength();
        int dexterityResult = testMage.getDexterity();
        int intelligenceResult = testMage.getIntelligence();


        Assertions.assertEquals(expectedStrength, strengthResult);
        Assertions.assertEquals(expectedDexterity, dexterityResult);
        Assertions.assertEquals(expectedIntelligence, intelligenceResult);
    }
}