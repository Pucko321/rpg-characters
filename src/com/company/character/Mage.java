package com.company.character;

public class Mage extends Character {

    public Mage() {
        super();
    }

    public Mage(String name) {
        super(name);
    }

    @Override
    public void increaseAttributes() {
        int strengthGain = 1;
        int dexterityGain = 1;
        int intelligenceGain = 5;
        getAttributes().increaseAttributes(strengthGain, dexterityGain, intelligenceGain);
    }
}
