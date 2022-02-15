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

    // Methods
    private void levelUp(int strengthGain, int dexterityGain, int intelligenceGain) {
        int newStrength = getStrength() + strengthGain;
        int newDexterity = getDexterity() + dexterityGain;
        int newIntelligence = getIntelligence() + intelligenceGain;
        setStrength(newStrength);
        setDexterity(newDexterity);
        setIntelligence(newIntelligence);
    }

    // toString
    @Override
    public String toString() {
        return "Attributes: " +
                "- strength: " + strength +
                "- dexterity: " + dexterity +
                "- intelligence: " + intelligence;
    }
}
