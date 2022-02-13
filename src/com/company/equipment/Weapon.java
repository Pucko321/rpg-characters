package com.company.equipment;

public class Weapon {
    private enum WeaponType {
        AXE,
        BOW,
        DAGGER,
        HAMMER,
        STAFF,
        SWORD,
        WAND
    }

    private int damage;
    private double attackSpeed;
    private WeaponType weaponType;
}
