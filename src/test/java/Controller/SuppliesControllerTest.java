/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Supplies;
import model.SupplyType;
import model.Team;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hiramtodd
 */
public class SuppliesControllerTest {
    
    public SuppliesControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of purchaseSupplies method, of class suppliesControler.
     */
    @org.junit.Test
    public void testPurchaseSupplies() throws Exception {
        System.out.println("purchaseSupplies");
        Supplies supply = new Supplies();
        supply.setPrice(10.00);
        supply.setSupplyType(SupplyType.OX);
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(100.00);
        SuppliesController instance = new SuppliesController();
        Supplies result = null;
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(Exception e) {
            
        }
        
        assertNotNull(result);
    }
    
        @org.junit.Test
    public void testPurchaseSupplies_nullSupplies() throws Exception {
        System.out.println("purchaseSupplies");
        Supplies supply = null;
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(100.00);
        SuppliesController instance = new SuppliesController();
        Supplies result = null;
        String expectedResult = "You must select a valid supply.";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(Exception e) {
            assertEquals(expectedResult, e.getMessage());
        }
        
    }
    
            @org.junit.Test
    public void testPurchaseSupplies_zeroQuantity() throws Exception {
        System.out.println("purchaseSupplies");
        Supplies supply = new Supplies();
        supply.setPrice(10.00);
        supply.setSupplyType(SupplyType.OX);
        int quantity = 0;
        Team team = new Team();
        team.setMoneyInPocket(100.00);
        SuppliesController instance = new SuppliesController();
        Supplies result = null;
        String expectedResult = "You must enter a quantity greater than 0.";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(Exception e) {
            assertEquals(expectedResult, e.getMessage());
        }
    }
    
                @org.junit.Test
    public void testPurchaseSupplies_nullTeam() throws Exception {
        System.out.println("purchaseSupplies");
        Supplies supply = new Supplies();
        supply.setPrice(10.00);
        supply.setSupplyType(SupplyType.OX);
        int quantity = 1;
        Team team = null;
        SuppliesController instance = new SuppliesController();
        Supplies result = null;
        String expectedResult = "You must be on a team to purchase supplies.";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(Exception e) {
            assertEquals(expectedResult, e.getMessage());
        }
    }
    
                    @org.junit.Test
    public void testPurchaseSupplies_noMoney() throws Exception {
        System.out.println("purchaseSupplies");
        Supplies supply = new Supplies();
        supply.setPrice(10.00);
        supply.setSupplyType(SupplyType.OX);
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(25.00);
        SuppliesController instance = new SuppliesController();
        Supplies result = null;
        String expectedResult = "You do not have enough money to purchase these supplies.";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(Exception e) {
            assertEquals(expectedResult, e.getMessage());
        }
    }
    
                        @org.junit.Test
    public void testPurchaseSupplies_noSupply() throws Exception {
        System.out.println("purchaseSupplies");
        Supplies supply = new Supplies();
        supply.setPrice(0);
        supply.setSupplyType(SupplyType.OX);
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(100.00);
        SuppliesController instance = new SuppliesController();
        Supplies result = null;
        String expectedResult = "This supply is unavailable";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(Exception e) {
            assertEquals(expectedResult, e.getMessage());
        }
    }
    
    @org.junit.Test
    public void testPurchaseSupplies_boundry() throws Exception {
        System.out.println("purchaseSupplies");
        Supplies supply = new Supplies();
        supply.setPrice(10.00);
        supply.setSupplyType(SupplyType.OX);
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(50.00);
        SuppliesController instance = new SuppliesController();
        Supplies result = null;
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(Exception e) {
            
        }
        
        assertNotNull(result);
        assertEquals(0, team.getMoneyInPocket(), .01);
    }
}
