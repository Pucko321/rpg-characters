package com.company.character;

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
    private String primaryAttribute;
    private final HashMap<Slot, Item> equipment = new HashMap<>();

    public Character() {
        // Default values constructor
        setLevel(1);

        for (Slot slot: Slot.values()) {
            setEquipmentSlot(slot);
        }
    }

    public Character(String name) {
        this();
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

    private void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        setLevel(getLevel() + 1);
    }

    private void setAttributes(PrimaryAttribute attributes) {
        this.attributes = attributes;
    }

    private void setPrimaryAttribute(String primaryAttribute) {
        this.primaryAttribute = primaryAttribute;
    }

    public void setEquipmentSlot(Slot slot) {
        this.equipment.put(slot, null);
    }

    public void equipItem(Slot slot, Item item) {
        this.equipment.put(slot, item);
    }
}
