package com.company.character;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class RangerTest {
    Ranger testMage;
    String originalName = "Test name";

    @BeforeEach
    void setUp() {
        testMage = new Ranger(originalName);
    }
}