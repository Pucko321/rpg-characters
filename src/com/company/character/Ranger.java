package com.company.character;

import com.company.Enum.CharacterType;

public class Ranger extends Character {

    public Ranger() {
        super(CharacterType.RANGER);
    }

    public Ranger(String name) {
        super(name, CharacterType.RANGER);
    }
}
