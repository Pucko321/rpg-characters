package com.company.character;

import com.company.Enum.Slot;
import com.company.PrimaryAttribute;
import com.company.equipment.Item;

import java.util.HashMap;

public class Character {
    private String name;
    private int level;
    private PrimaryAttribute attributes;
    private String primaryAttribute;
    private HashMap<Slot, Item> equipment;
}
