package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryAttributeTest {
    PrimaryAttribute attributes;
    int originalStrength = 1;
    int originalDexterity = 2;
    int originalIntelligence = 3;

    @BeforeEach
    void setUp() {
        attributes = new PrimaryAttribute(originalStrength, originalDexterity, originalIntelligence);
    }

    @Test
    void increaseAttributes_ValidValue_ShouldPass() {
        int strengthGain = 10;
        int dexterityGain = 20;
        int intelligenceGain = 30;
        int expectedStrength = originalStrength + strengthGain;
        int expectedDexterity = originalDexterity + dexterityGain;
        int expectedIntelligence = originalIntelligence + intelligenceGain;

        attributes.increaseAttributes(strengthGain, dexterityGain, intelligenceGain);

        Assertions.assertEquals(attributes.getStrength(), expectedStrength);
        Assertions.assertEquals(attributes.getDexterity(), expectedDexterity);
        Assertions.assertEquals(attributes.getIntelligence(), expectedIntelligence);
    }

    @Test
    void testToString() {
    }
}