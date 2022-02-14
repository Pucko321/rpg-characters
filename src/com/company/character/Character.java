package com.company.character;

import com.company.Enum.Slot;
import com.company.PrimaryAttribute;
import com.company.equipment.Item;
import com.company.equipment.Weapon;

import java.util.HashMap;

public class Character {
    private String name;
    private int level;
    private PrimaryAttribute attributes;
    private String primaryAttribute;
    private HashMap<Slot, Item> equipment;

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

    public String getPrimaryAttribute() {
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

    public void setLevel(int level) {
        this.level = level;
    }

    private void setAttributes(PrimaryAttribute attributes) {
        this.attributes = attributes;
    }

    private void setPrimaryAttribute(String primaryAttribute) {
        this.primaryAttribute = primaryAttribute;
    }

    public void setEquipment(HashMap<Slot, Item> equipment) {
        this.equipment = equipment;
    }
}
