/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Exceptions.SuppliesControllerExceptions;
import model.SupplyType;
import model.Team;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
    public void testPurchaseSupplies() throws SuppliesControllerExceptions {
        System.out.println("purchaseSupplies");
        SupplyType supply = SupplyType.OXEN;
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(1000.00);
        SuppliesController instance = new SuppliesController();
        SupplyType result = null;
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(SuppliesControllerExceptions e) {
            
        }
        
        assertNotNull(result);
    }
    
        @org.junit.Test
    public void testPurchaseSupplies_nullSupplies() throws SuppliesControllerExceptions {
        System.out.println("purchaseSupplies");
        SupplyType supply = null;
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(1000.00);
        SuppliesController instance = new SuppliesController();
        SupplyType result = null;
        String expectedResult = "You must select a valid supply.";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(SuppliesControllerExceptions e) {
            assertEquals(expectedResult, e.getMessage());
        }
        
    }
    
            @org.junit.Test
    public void testPurchaseSupplies_zeroQuantity() throws SuppliesControllerExceptions {
        System.out.println("purchaseSupplies");
        SupplyType supply = SupplyType.OXEN;
        int quantity = 0;
        Team team = new Team();
        team.setMoneyInPocket(1000.00);
        SuppliesController instance = new SuppliesController();
        SupplyType result = null;
        String expectedResult = "You must enter a quantity greater than 0.";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(SuppliesControllerExceptions e) {
            assertEquals(expectedResult, e.getMessage());
        }
    }
    
                @org.junit.Test
    public void testPurchaseSupplies_nullTeam() throws SuppliesControllerExceptions {
        System.out.println("purchaseSupplies");
        SupplyType supply = SupplyType.OXEN;
        int quantity = 1;
        Team team = null;
        SuppliesController instance = new SuppliesController();
        SupplyType result = null;
        String expectedResult = "You must be on a team to purchase supplies.";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(SuppliesControllerExceptions e) {
            assertEquals(expectedResult, e.getMessage());
        }
    }
    
                    @org.junit.Test
    public void testPurchaseSupplies_noMoney() throws SuppliesControllerExceptions {
        System.out.println("purchaseSupplies");
        SupplyType supply = SupplyType.OXEN;
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(25.00);
        SuppliesController instance = new SuppliesController();
        SupplyType result = null;
        String expectedResult = "You do not have enough money to purchase these supplies.";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(SuppliesControllerExceptions e) {
            assertEquals(expectedResult, e.getMessage());
        }
    }
    
                        @org.junit.Test
    public void testPurchaseSupplies_noSupply() throws SuppliesControllerExceptions {
        System.out.println("purchaseSupplies");
        SupplyType supply = SupplyType.OXEN;
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(1000.00);
        SuppliesController instance = new SuppliesController();
        SupplyType result = null;
        String expectedResult = "This supply is unavailable";
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(SuppliesControllerExceptions e) {
            assertEquals(expectedResult, e.getMessage());
        }
    }
    
    @org.junit.Test
    public void testPurchaseSupplies_boundry() throws SuppliesControllerExceptions {
        System.out.println("purchaseSupplies");
        SupplyType supply = SupplyType.OXEN;
        int quantity = 5;
        Team team = new Team();
        team.setMoneyInPocket(400.00);
        SuppliesController instance = new SuppliesController();
        SupplyType result = null;
        try {
            result = instance.purchaseSupplies(supply, quantity, team);
        } catch(SuppliesControllerExceptions e) {
            
        }
        
        assertNotNull(result);
        assertEquals(0, team.getMoneyInPocket(), .01);
    }
}
