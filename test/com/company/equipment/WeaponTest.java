package com.company.equipment;

import com.company.Enum.Slot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WeaponTest {
    Weapon testWeapon;
    String originalName = "Test Name";
    int originalLevel = 1;
    Slot originalSlot = Slot.WEAPON;
    int originalDamage = 10;
    double originalAttackSpeed = 2.0;
    Weapon.WeaponType originalWeaponType = Weapon.WeaponType.STAFF;

    @BeforeEach
    void setUp() {
        testWeapon = new Weapon(originalName, originalLevel, originalSlot, originalDamage, originalAttackSpeed, originalWeaponType);
    }

    // Getters
    @Test
    void getName_ValidValue_ShouldPass() {
        String result = testWeapon.getName();

        Assertions.assertEquals(originalName, result);
    }

    @Test
    void getLevel_ValidValue_ShouldPass() {
        int result = testWeapon.getLevel();

        Assertions.assertEquals(originalLevel, result);
    }

    @Test
    void getSlot_ValidValue_ShouldPass() {
        Slot result = testWeapon.getSlot();

        Assertions.assertEquals(originalSlot, result);
    }

    @Test
    void getDamage_ValidValue_ShouldPass() {
        int result = testWeapon.getDamage();

        Assertions.assertEquals(originalDamage, result);
    }

    @Test
    void getAttackSpeed_ValidValue_ShouldPass() {
        double result = testWeapon.getAttackSpeed();

        Assertions.assertEquals(originalAttackSpeed, result);
    }

    @Test
    void getDPS_ValidValue_ShouldPass() {
        double expected = 20.0;
        double result = testWeapon.getDPS();

        Assertions.assertEquals(expected, result);
    }

    @Test
    void getWeaponType_ValidValue_ShouldPass() {
        Weapon.WeaponType result = testWeapon.getWeaponType();

        Assertions.assertEquals(originalWeaponType, result);
    }

    // Setters are tested in CharacterWithEquipmentTest
}