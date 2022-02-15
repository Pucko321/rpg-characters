package com.company.character;

import com.company.Enum.CharacterType;
import com.company.Enum.PrimaryAttributeType;
import com.company.Enum.Slot;
import com.company.PrimaryAttribute;
import com.company.equipment.Armour;
import com.company.equipment.Item;
import com.company.equipment.Weapon;

import java.util.HashMap;

public abstract class Character {
    private String name;
    private int level;
    private PrimaryAttribute attributes;
    private PrimaryAttributeType primaryAttribute;
    private final HashMap<Slot, Item> equipment = new HashMap<>();

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

    // Methods
    public void levelUp() {
        setLevel(getLevel() + 1);
        increaseAttributes();
    }

    public abstract void increaseAttributes();

    public void equipItem(Slot slot, Item item) {
        this.equipment.put(slot, item);
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
