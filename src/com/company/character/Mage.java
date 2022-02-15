package com.company.character;

import com.company.Enum.CharacterType;

public class Mage extends Character {

    public Mage() {
        super(CharacterType.MAGE);
    }

    public Mage(String name) {
        super(name, CharacterType.MAGE);
    }
}
