package com.company.character;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {
    Mage testMage;
    String originalName = "Test name";

    @BeforeEach
    void setUp() {
        testMage = new Mage(originalName);
    }
}