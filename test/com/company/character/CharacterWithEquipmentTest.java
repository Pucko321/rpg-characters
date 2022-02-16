package com.company.character;

import com.company.Enum.Slot;
import com.company.PrimaryAttribute;
import com.company.equipment.Armour;
import com.company.equipment.Weapon;
import com.company.exception.InvalidArmourException;
import com.company.exception.InvalidWeaponException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CharacterWithEquipmentTest {
    Weapon testWeapon;
    Armour testPlateBody;
    Weapon testBow;
    Armour testClothHead;
    Warrior testWarrior;

    @BeforeEach
    void setUp() {
        testWeapon = new Weapon();
        testWeapon.setName("Common Axe");
        testWeapon.setLevel(1);
        testWeapon.setSlot(Slot.WEAPON);
        testWeapon.setWeaponType(Weapon.WeaponType.AXE);
        testWeapon.setDamage(7);
        testWeapon.setAttackSpeed(1.1);

        testPlateBody = new Armour();
        testPlateBody.setName("Common Plate Body Armour");
        testPlateBody.setLevel(1);
        testPlateBody.setSlot(Slot.BODY);
        testPlateBody.setArmourType(Armour.ArmourType.PLATE);
        testPlateBody.setAttributes(new PrimaryAttribute(1, 0, 0));

        testBow = new Weapon();
        testBow.setName("Common Bow");
        testBow.setLevel(1);
        testBow.setSlot(Slot.WEAPON);
        testBow.setWeaponType(Weapon.WeaponType.BOW);
        testBow.setDamage(12);
        testBow.setAttackSpeed(0.8);

        testClothHead = new Armour();
        testClothHead.setName("Common Cloth Head Armour");
        testClothHead.setLevel(1);
        testClothHead.setSlot(Slot.HEAD);
        testClothHead.setArmourType(Armour.ArmourType.CLOTH);
        testClothHead.setAttributes(new PrimaryAttribute(0, 0, 5));

        testWarrior = new Warrior();
    }

    @Test
    void toHighWeaponLevel_ValidValue_ShouldThrowInvalidWeaponException() {
        testWeapon.setLevel(2);
        Exception exception = assertThrows(InvalidWeaponException.class, () -> {
            testWarrior.equipItem(Slot.WEAPON, testWeapon);
        });

        String expectedMessage = "You must have a level of 2 to wield this weapon.";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void toHighArmourLevel_ValidValue_ShouldThrowInvalidWeaponException() {
        testPlateBody.setLevel(2);
        InvalidArmourException exception = assertThrows(InvalidArmourException.class, () -> {
            testWarrior.equipItem(Slot.WEAPON, testPlateBody);
        });

        String expectedMessage = "You must have a level of 2 to wield this armour.";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void getDPSNoWeapon_ValidValue_ShouldPass() {

    }
}