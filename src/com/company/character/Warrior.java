package com.company.character;

import com.company.Enum.CharacterType;

public class Warrior extends Character {

    public Warrior() {
        super(CharacterType.WARRIOR);
    }

    public Warrior(String name) {
        super(name, CharacterType.WARRIOR);
    }
}
