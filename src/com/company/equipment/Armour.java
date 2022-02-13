package com.company.equipment;

import com.company.PrimaryAttribute;

public class Armour {
    private enum ArmourType {
        CLOTH,
        LEATHER,
        MAIL,
        PLATE
    }

    private PrimaryAttribute attributes;
    private ArmourType armourType;
}
