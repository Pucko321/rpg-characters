package com.company.equipment;

import com.company.Enum.Slot;
import com.company.PrimaryAttribute;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArmourTest {
    Armour testArmour;
    String originalName = "Test Name";
    int originalLevel = 1;
    Slot originalSlot = Slot.HEAD;
    PrimaryAttribute originalAttributes = new PrimaryAttribute(1, 2, 3);
    Armour.ArmourType originalArmourType = Armour.ArmourType.CLOTH;

    @BeforeEach
    void setUp() {
        testArmour = new Armour(originalName, originalLevel, originalSlot, originalAttributes, originalArmourType);
    }

    @Test
    void getAttributes() {
    }

    @Test
    void getArmourType() {
    }
}