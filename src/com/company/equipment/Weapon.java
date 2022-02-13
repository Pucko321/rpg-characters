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

    // Getters
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public double getDPS() {
        return getDamage() * getAttackSpeed();
    }

    // Setters
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
