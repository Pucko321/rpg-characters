package com.company.equipment;

import com.company.Enum.Slot;
import com.company.PrimaryAttribute;

public class Armour extends Item {
    private enum ArmourType {
        CLOTH,
        LEATHER,
        MAIL,
        PLATE
    }

    private PrimaryAttribute attributes;
    private ArmourType armourType;

    public Armour() {
        super();
    }

    public Armour(String name, int level, Slot slot, PrimaryAttribute attributes, ArmourType armourType) {
        super(name, level, slot);
        setAttributes(attributes);
        setArmourType(armourType);
    }

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

    // toString
    @Override
    public String toString() {
        return super.toString() +
                ", " + attributes.toString() +
                ", Armour Type: " + armourType;
    }
}
