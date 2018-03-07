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

/**
 *
 * @author hiramtodd
 */
public class supplyWeightControllerTest {
    
    public supplyWeightControllerTest() {
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
    public void testSuppliesTooHeavy(){
        Supplies supply = new Supplies();
        supply.setWeight(100);
        int quantity = 4;
        
        supplyWeightController instance = new supplyWeightController();
        Boolean expResult = false;
        
        Boolean result = instance.supplyWeightTooHeavy(supply, quantity);
        
        assertEquals(expResult, result);
    }
    
}
