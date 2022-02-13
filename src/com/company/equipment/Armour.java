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

    // Getters
    public PrimaryAttribute getAttributes() {
        return attributes;
    }

    public ArmourType getArmourType() {
        return armourType;
    }

    // Setters
    public void setAttributes(PrimaryAttribute attributes) {
        this.attributes = attributes;
    }

    public void setArmourType(ArmourType armourType) {
        this.armourType = armourType;
    }
}
