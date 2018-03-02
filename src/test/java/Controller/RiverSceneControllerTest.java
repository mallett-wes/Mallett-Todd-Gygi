/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.RiverCrossingScene;
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
    
    public void testRiverDepth() throws Exception {
        
        namedSeason = "Winter";
        depth = 0;
        double result = 0;
        double expectedResult= 3.25;
        try {
            result = instance.calculateRiverDepth(depth, namedSeason);
        } catch(Exception e) {
            
        }
        
         assertEquals(expectedResult, e.getMessage());
    }
    
    public void testRiverDepth() throws Exception {
        
        namedSeason = "Summer";
        depth = 0;
        double result = 0;
        double expectedResult= 2.25;
        try {
            result = instance.calculateRiverDepth(depth, namedSeason);
        } catch(Exception e) {
            
        }
        
         assertEquals(expectedResult == result);
    }
    
    public void testRiverDepth() throws Exception {
        
        namedSeason = "1";
        depth = 0;
        result = 0;
        String expectedResult= "That is not an acceptable season";
        try {
            result = instance.calculateRiverDepth(depth, namedSeason);
        } catch(Exception e) { 
            
        }
        
         assertEquals(expectedResult, e.getMessage());
    }
}
