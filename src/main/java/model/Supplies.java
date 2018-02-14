package model;

import java.io.Serializable;
import java.util.Objects;

public class Supplies implements Serializable {

    private SupplyType supplyType;
    private int livestockHealth;
    private double quantityInStock;
    private double requiredAmount;
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Supplies(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplies supplies = (Supplies) o;

        if (livestockHealth != supplies.livestockHealth) return false;
        if (Double.compare(supplies.quantityInStock, quantityInStock) != 0) return false;
        if (Double.compare(supplies.requiredAmount, requiredAmount) != 0) return false;
        if (Double.compare(supplies.price, price) != 0) return false;
        return supplyType == supplies.supplyType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.supplyType);
        hash = 37 * hash + this.livestockHealth;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
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
