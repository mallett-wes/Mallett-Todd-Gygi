package Model;

import java.io.Serializable;

public class Supplies implements Serializable {

    private SupplyType supplyType;
    private int livestockHealth;
    private double quantityInStock;
    private double requiredAmount;
    private float price;

    public Supplies(SupplyType supplyType) {
        this.supplyType = supplyType;
    }

    public SupplyType getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(SupplyType supplyType) {
        this.supplyType = supplyType;
    }

    public int getLivestockHealth() {
        return livestockHealth;
    }

    public void setLivestockHealth(int livestockHealth) {
        this.livestockHealth = livestockHealth;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplies supplies = (Supplies) o;

        if (livestockHealth != supplies.livestockHealth) return false;
        if (Double.compare(supplies.quantityInStock, quantityInStock) != 0) return false;
        if (Double.compare(supplies.requiredAmount, requiredAmount) != 0) return false;
        if (Float.compare(supplies.price, price) != 0) return false;
        return supplyType == supplies.supplyType;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = supplyType.hashCode();
        result = 31 * result + livestockHealth;
        temp = Double.doubleToLongBits(quantityInStock);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(requiredAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Supplies{" +
                "supplyType=" + supplyType +
                ", livestockHealth=" + livestockHealth +
                ", quantityInStock=" + quantityInStock +
                ", requiredAmount=" + requiredAmount +
                ", price=" + price +
                '}';
    }

    public void incrementLivestockHealth(int healthPoints){
        int newHealth = this.livestockHealth + healthPoints;
        if(newHealth >= 10){
            this.livestockHealth = 10;
        }else{
            this.livestockHealth = newHealth;
        }
    }

    public void decrementLivestockHealth(int healthPoints){
        int newHealth = this.livestockHealth - healthPoints;
        if(newHealth <= 0){
            this.livestockHealth = 0;
        }else{
            this.livestockHealth = newHealth;
        }
    }
}
