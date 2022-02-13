package com.company.equipment;

import com.company.Enum.Slot;

public abstract class Item {
    private String name;
    private int level;
    private Slot slot;

    public Item() {}

    public Item(String name, int level, Slot slot) {
        setName(name);
        setLevel(level);
        setSlot(slot);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Slot getSlot() {
        return slot;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    // toString
    @Override
    public String toString() {
        return "Name: '" + name + '\'' +
                ", Level: " + level;
    }
}
