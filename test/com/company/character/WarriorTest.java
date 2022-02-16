package com.company.character;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    Warrior testWarrior;
    String originalName = "Test name";

    @BeforeEach
    void setUp() {
        testWarrior = new Warrior(originalName);
    }
}