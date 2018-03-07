/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.RiverCrossingScene;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Kyrie Gygi
 */
public class RiverSceneControllerTest {
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
    
    public void testRiverDepth(){
        RiverSceneController controllerInstance = new RiverSceneController();
        String namedSeason = "Winter";
        double result = 0;
        double expectedResult= 3.25;
        
        result = controllerInstance.calculateRiverDepth(namedSeason);
        
         assertEquals(expectedResult, result, .0);
    }
    
    public void testRiverDepth_Summer(){
        RiverSceneController controllerInstance = new RiverSceneController();
        String namedSeason = "Summer";
        double result = 0;
        double expectedResult= 2.25;
        
        result = controllerInstance.calculateRiverDepth(namedSeason);
        
         assertEquals(expectedResult, result, .0);
    }
    
    public void testRiverDepth_InvalidSeason(){
        RiverSceneController controllerInstance = new RiverSceneController();
        String namedSeason = "1";
        double result = 0;
        String expectedResult= "That is not an acceptable season";
        result = controllerInstance.calculateRiverDepth(namedSeason);
        
         assertEquals(expectedResult, result);
    }
}
