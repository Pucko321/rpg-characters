package com.company.equipment;

import com.company.Enum.Slot;

public class Weapon extends Item {
    public enum WeaponType {
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

    public Weapon() {
        super();
    }

    public Weapon(String name, int level, Slot slot, int damage, double attackSpeed, WeaponType weaponType) {
        super(name, level, slot);
        setDamage(damage);
        setAttackSpeed(attackSpeed);
        setWeaponType(weaponType);
    }

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

    // toString
    @Override
    public String toString() {
        return  super.toString() +
                ", Damage: " + damage +
                ", Attack Speed: " + attackSpeed +
                ", WeaponType: " + weaponType;
    }
}
