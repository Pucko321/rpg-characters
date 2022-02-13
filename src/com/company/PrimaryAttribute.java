package com.company;

public class PrimaryAttribute {
    private int strength;
    private int dexterity;
    private int intelligence;

    public PrimaryAttribute(int strength, int dexterity, int intelligence) {
        setStrength(strength);
        setDexterity(dexterity);
        setIntelligence(intelligence);
    }

    // Getters
    public int getStrength() {
        return this.strength;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    // Setters
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
