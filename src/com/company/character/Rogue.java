package com.company.character;

import com.company.Enum.CharacterType;

public class Rogue extends Character {

    public Rogue() {
        super(CharacterType.ROGUE);
    }

    public Rogue(String name) {
        super(name, CharacterType.ROGUE);
    }
}
