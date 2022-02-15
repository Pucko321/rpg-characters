package com.company.character;

import com.company.Enum.CharacterType;

public class Mage extends Character {

    public Mage() {
        super(CharacterType.MAGE);
    }

    public Mage(String name) {
        super(name, CharacterType.MAGE);
    }

    @Override
    public void increaseAttributes() {
        int strengthGain = 1;
        int dexterityGain = 1;
        int intelligenceGain = 5;
        getAttributes().increaseAttributes(strengthGain, dexterityGain, intelligenceGain);
    }
}
