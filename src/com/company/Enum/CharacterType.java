package com.company.Enum;

public enum CharacterType {
    MAGE(   1, 1, 8, 1, 1, 5, PrimaryAttributeType.INTELLIGENCE),
    RANGER( 1, 7, 1, 1, 5, 1, PrimaryAttributeType.DEXTERITY),
    ROGUE(  2, 6, 1, 1, 4, 1, PrimaryAttributeType.DEXTERITY),
    WARRIOR(5, 2, 1, 3, 2, 1, PrimaryAttributeType.STRENGTH);

    final public int defaultStrength;
    final public int defaultDexterity;
    final public int defaultIntelligence;
    final public int strengthGain;
    final public int dexterityGain;
    final public int intelligenceGain;
    final public PrimaryAttributeType primaryAttribute;

    CharacterType(int defaultStrength, int defaultDexterity, int defaultIntelligence, int strengthGain, int dexterityGain, int intelligenceGain, PrimaryAttributeType primaryAttribute) {
        this.defaultStrength = defaultStrength;
        this.defaultDexterity = defaultDexterity;
        this.defaultIntelligence = defaultIntelligence;
        this.strengthGain = strengthGain;
        this.dexterityGain = dexterityGain;
        this.intelligenceGain = intelligenceGain;
        this.primaryAttribute = primaryAttribute;
    }
}
