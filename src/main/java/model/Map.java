/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author hiramtodd
 */
public class Map implements Serializable {
    private int rowCount;
    private int columnCount;
    
    public int getRowCount() {
        return this.rowCount;
    }
    
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    
    public int getColumnCount() {
        return this.columnCount;
    }
    
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.rowCount;
        hash = 89 * hash + this.columnCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }
    
    public Map() {
        
    }
}
