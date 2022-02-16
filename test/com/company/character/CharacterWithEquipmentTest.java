package com.company.character;

import com.company.Enum.Slot;
import com.company.PrimaryAttribute;
import com.company.equipment.Armour;
import com.company.equipment.Weapon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        testWarrior.equipItem(Slot.WEAPON, testWeapon);
    }
}