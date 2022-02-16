package com.company.character;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {
    Rogue testRogue;
    String originalName = "Test name";

    @BeforeEach
    void setUp() {
        testRogue = new Rogue(originalName);
    }
}