/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Supplies;
import model.Team;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author hiramtodd
 */
public class SupplyWeightControllerTest {
    
    public SupplyWeightControllerTest() {
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
     * Test of supplyWeight method, of class supplyWeightController.
     */
    @Test
    @Ignore
    public void testSuppliesTooHeavy(){
        Supplies supply = new Supplies();
        supply.setWeight(100);
        int quantity = 4;
        
        SupplyWeightController instance = new SupplyWeightController();
        Boolean expResult = false;
        
        //Boolean result = instance.supplyWeightTooHeavy(supply, quantity);
        
        //assertEquals(expResult, result);
    }
    
}
