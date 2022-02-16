package com.company.equipment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    Weapon testWeapon;

    @BeforeEach
    void setUp() {
        testWeapon = new Weapon();
    }

    @Test
    void getDPS_ValidValue_ShouldPass() {
        int damage = 10;
        double attackSpeed = 2.0;
        double expected = 20.0;

        testWeapon.setDamage(10);
        testWeapon.setAttackSpeed(2.0);

        double result = testWeapon.getDPS();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void setWeaponType() {
    }
}