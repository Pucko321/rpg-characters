package com.company.character;

import com.company.Enum.CharacterType;
import com.company.Enum.PrimaryAttributeType;
import com.company.Enum.Slot;
import com.company.PrimaryAttribute;
import com.company.equipment.Armour;
import com.company.equipment.Item;
import com.company.equipment.Weapon;
import com.company.exception.InvalidArmourException;
import com.company.exception.InvalidWeaponException;

import java.util.HashMap;

public abstract class Character {
    private String name;
    private int level;
    private PrimaryAttribute attributes;
    private PrimaryAttributeType primaryAttribute;
    private final HashMap<Slot, Item> equipment = new HashMap<>();
    private CharacterType characterType;

    public Character(CharacterType characterType) {
        // Default values constructor
        setLevel(1);

        for (Slot slot: Slot.values()) {
            setEquipmentSlot(slot);
        }

        setAttributes(new PrimaryAttribute(
                characterType.defaultStrength,
                characterType.defaultDexterity,
                characterType.defaultIntelligence)
        );

        setPrimaryAttribute(characterType.primaryAttribute);

        setCharacterType(characterType);
    }

    public Character(String name, CharacterType characterType) {
        this(characterType);
        setName(name);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public PrimaryAttribute getAttributes() {
        return attributes;
    }

    public int getStrength() {
        return getAttributes().getStrength();
    }

    public int getDexterity() {
        return getAttributes().getDexterity();
    }

    public int getIntelligence() {
        return getAttributes().getIntelligence();
    }

    public PrimaryAttributeType getPrimaryAttribute() {
        return primaryAttribute;
    }

    public HashMap<Slot, Item> getEquipment() {
        return equipment;
    }

    public Item getHeadSlot() {
        return getEquipment().get(Slot.HEAD);
    }

    public Item getBodySlot() {
        return getEquipment().get(Slot.BODY);
    }

    public Item getLegsSlot() {
        return getEquipment().get(Slot.LEGS);
    }

    public Item getWeaponSlot() {
        return getEquipment().get(Slot.WEAPON);
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public int getBasePrimaryAttribute() {
        switch(getPrimaryAttribute()) {
            case STRENGTH:
                return getStrength();
            case DEXTERITY:
                return getDexterity();
            case INTELLIGENCE:
                getIntelligence();
            default:
                return 0;
        }
    }

    public int getArmourAttributes() {
        int headAttribute = 0;
        int bodyAttribute = 0;
        int legsAttribute = 0;

        if (getHeadSlot() != null) {
            headAttribute = ((Armour)getHeadSlot()).getAttributes().getPrimaryAttribute(getPrimaryAttribute());
        }

        if (getBodySlot() != null) {
            bodyAttribute = ((Armour)getBodySlot()).getAttributes().getPrimaryAttribute(getPrimaryAttribute());
        }

        if (getLegsSlot() != null) {
            legsAttribute = ((Armour)getLegsSlot()).getAttributes().getPrimaryAttribute(getPrimaryAttribute());
        }

        return headAttribute + bodyAttribute + legsAttribute;
    }

    public double getTotalPrimaryAttribute() {
        return getBasePrimaryAttribute() + getArmourAttributes();
    }

    public double getDPS() {
        double weaponDPS = 1.0;
        if (getWeaponSlot() != null) {
            weaponDPS = ((Weapon)getWeaponSlot()).getDPS();
        }

        return weaponDPS * (1 + getTotalPrimaryAttribute() / 100);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    private void setAttributes(PrimaryAttribute attributes) {
        this.attributes = attributes;
    }

    private void setPrimaryAttribute(PrimaryAttributeType primaryAttribute) {
        this.primaryAttribute = primaryAttribute;
    }

    public void setEquipmentSlot(Slot slot) {
        this.equipment.put(slot, null);
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }

    // Methods
    public void levelUp() {
        setLevel(getLevel() + 1);
        increaseAttributes();
    }

    private void increaseAttributes() {
        int strengthGain = getCharacterType().strengthGain;
        int dexterityGain = getCharacterType().dexterityGain;
        int intelligenceGain = getCharacterType().intelligenceGain;
        getAttributes().increaseAttributes(strengthGain, dexterityGain, intelligenceGain);
    }

    public void equipItem(Slot slot, Item item) throws InvalidWeaponException, InvalidArmourException {
        // If the characters level is lower than the item requirement -> throw an invalid weapon exception
        if (getLevel() < item.getLevel()) {
            if (item instanceof Weapon) {
                throw new InvalidWeaponException("You must have a level of " + item.getLevel() + " to wield this weapon.");
            }
            else {
                throw new InvalidArmourException("You must have a level of " + item.getLevel() + " to wield this armour.");
            }

        }
        else {
            this.equipment.put(slot, item);
        }
    }

    // toString
    @Override
    public String toString() {
        return "Character" +
                "-----------" +
                "name: " + name +
                ", level: " + level +
                attributes.toString() +
                ", DPS: " + "TODO";
    }
}
