package model;

public enum SupplyType {
    OXEN("Oxen", 80),
    FOOD("Food", 50),
    WATER("Water", 10),
    CLOTHING("Clothing", 20),
    AMMUNITION("Ammunition", 35),
    SPARE_PARTS("Spare Parts", 25);
    
    private final String key;
    private final Integer value;

    SupplyType(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }
}
